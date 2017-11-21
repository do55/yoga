package pl.yogainstitute.dao;

import pl.yogainstitute.domain.Order;

public interface OrderDao {
	
	public Order findById(Integer id);
    public void insert(Order order);
    public void update(Order order);
    public void delete(Integer id);

}
