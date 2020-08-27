package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ssm.model.Order;
import ssm.model.User;
import ssm.service.OrderService;
import ssm.service.UserService;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("selectOrderByUser")
    public HashMap<String, Object> findOrdersByUser(String bh) {
        List<Order> orderList = orderService.findOrderByUserBh(bh);
        User user = userService.findUserByBh(bh);
        HashMap<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("orders", orderList);
        objectMap.put("userInfo", user);
        return objectMap;
    }

    @ResponseBody
    @RequestMapping("deleteOrderByBh")
    public String deleteOrderByBh(String order_bh) {
        orderService.deleteOrderByBh(order_bh);
        return null;
    }
}
