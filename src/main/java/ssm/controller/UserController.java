package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ssm.model.User;
import ssm.service.UserService;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/demo")
public class UserController {

    @Autowired
    public UserService userService;

    @ResponseBody
    @RequestMapping("showAllUsers")
    public List showAllUsers() {
        List<User> userList = userService.findAllUsers();
        return userList;
    }

    @ResponseBody
    @RequestMapping("/login")
    public User userLogin(String name, String password) {
        List<User> userList = userService.findUser(name, password);
        if (userList == null || userList.size() == 0) {
            return null;
        } else {
            return userList.get(0);
        }
    }

    @RequestMapping("goToChangePassword")
    public String goToChangePassword(String bh, Model model) {
        model.addAttribute("bh", bh);
        return "changePassword";
    }

    @ResponseBody
    @RequestMapping("updatePassword")
    public HashMap<String, String> updatePassword(String bh, String password) {
        userService.updatePassword(bh, password);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("bh", bh);
        return map;
    }

    @ResponseBody
    @RequestMapping("deleteUserByBh")
    public String deleteUser(String bh) {
        userService.deleteUserByBh(bh);
        return null;
    }
}
