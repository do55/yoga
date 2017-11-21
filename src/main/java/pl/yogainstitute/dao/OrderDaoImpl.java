package pl.yogainstitute.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pl.yogainstitute.domain.Order;
import pl.yogainstitute.utils.HibernateUtil;

public class OrderDaoImpl implements OrderDao {
	
	private Logger logger = Logger.getLogger(OrderDaoImpl.class);

	@Override
	public Order findById(Integer id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = null;

        try {
            order = session.load(Order.class, id);   
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during order load with id=" + id, e);
        }

    return order;
	}

	@Override
	public void insert(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
