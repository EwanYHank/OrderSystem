package ssm.dao;

import org.springframework.stereotype.Repository;
import ssm.model.Order;

import java.util.List;

@Repository
public interface OrderDao {
    public List<Order> findOrderByUserBh(String bh);

    public void deleteOrderByBh(String bh);
}
