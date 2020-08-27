package ssm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.UserDao;
import ssm.model.User;
import ssm.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;

    public List<User> findAllUsers() {
        List<User> userList = userDao.findAllUsers();
        return userList;
    }

    public List<User> findUser(String name, String password) {
        List<User> userList = userDao.findUserByNameAndPassword(name, password);
        return userList;
    }

    public User findUserByBh(String bh) {
        User user = userDao.findUserByBh(bh);
        return user;
    }

    public void updatePassword(String bh, String password) {
        userDao.updatePassword(bh, password);
    }

    public void deleteUserByBh(String bh) {
        userDao.deleteUserByBh(bh);
    }
}
