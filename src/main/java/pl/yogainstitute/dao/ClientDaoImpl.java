package pl.yogainstitute.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pl.yogainstitute.domain.Client;
import pl.yogainstitute.utils.HibernateUtil;

public class ClientDaoImpl implements ClientDao {
	
	private Logger logger = Logger.getLogger(ClientDaoImpl.class);

	@Override
	public Client findById(Integer id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Client client = null;

        try {
            client = session.load(Client.class, id);   
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Problem during client load with id=" + id, e);
        }

    return client;
    
	}

	@Override
	public void insert(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
