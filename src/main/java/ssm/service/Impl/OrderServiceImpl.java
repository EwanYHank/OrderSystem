package ssm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.OrderDao;
import ssm.model.Order;
import ssm.service.OrderService;
import ssm.service.UserService;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    public OrderDao orderDao;

    public List<Order> findOrderByUserBh(String bh) {
        return orderDao.findOrderByUserBh(bh);
    }

    public void deleteOrderByBh(String bh) {
        orderDao.deleteOrderByBh(bh);
    }
}
