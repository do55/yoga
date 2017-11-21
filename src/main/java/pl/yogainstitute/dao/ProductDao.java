package pl.yogainstitute.dao;

import pl.yogainstitute.domain.Product;

public interface ProductDao {
	
	public Product findById(Integer id);
    public void insert(Product product);
    public void update(Product product);
    public void delete(Integer id);


}
