package ssm.service;

import ssm.model.Order;

import java.util.List;

public interface OrderService {
    public List<Order> findOrderByUserBh(String bh);

    public void deleteOrderByBh(String bh);
}
