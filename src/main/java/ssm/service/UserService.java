package ssm.service;

import org.springframework.stereotype.Service;
import ssm.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUsers();

    public List<User> findUser(String name, String password);

    public User findUserByBh(String bh);

    public void updatePassword(String bh, String password);

    public void deleteUserByBh(String bh);
}
