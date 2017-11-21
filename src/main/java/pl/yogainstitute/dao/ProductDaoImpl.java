package pl.yogainstitute.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pl.yogainstitute.domain.Product;
import pl.yogainstitute.utils.HibernateUtil;

public class ProductDaoImpl implements ProductDao {
	
	private Logger logger = Logger.getLogger(ProductDaoImpl.class);

	@Override
	public Product findById(Integer id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product = null;

        try {
            product = session.load(Product.class, id);   
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during product load with id=" + id, e);
        }

    return product;
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
