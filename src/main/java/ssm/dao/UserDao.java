package ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ssm.model.User;

import java.util.List;

@Repository
public interface UserDao {
    public List<User> findAllUsers();

    public List<User> findUserByNameAndPassword(@Param("name") String name,
                                                @Param("password") String password);

    public User findUserByBh(String bh);

    public void updatePassword(@Param("bh") String bh, @Param("newPassword") String password);

    public void deleteUserByBh(String bh);
}
