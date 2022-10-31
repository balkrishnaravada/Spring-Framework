package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;


import productcrudapp.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
		
	}
	
	public List<Product> getProducts()
	{
		List<Product> products=this.hibernateTemplate.loadAll(Product.class);
		
		return products;
	}
	
	public Product getSingleProduct(int productId)
	{
		return this.hibernateTemplate.get(Product.class,productId);
		
	}
	
	//single product deleted
	@Transactional
	public void deleteProduct(int productId)
	{
		Product p=this.hibernateTemplate.load(Product.class,productId);
		this.hibernateTemplate.delete(p);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
