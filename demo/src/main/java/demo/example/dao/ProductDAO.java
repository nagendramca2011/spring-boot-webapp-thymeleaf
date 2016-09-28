package demo.example.dao;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import demo.example.model.Product;


public class ProductDAO {
	public Product find(){
		return new Product("p01","Name 1","1.png",new Date());
	}
	public List<Product> findAll()
	{
		List<Product> products=new ArrayList<Product>();
		products.add(new Product("p01","Name 1","1.png",new Date()));
		products.add(new Product("p02","Name 2","2.png",new Date()));
		products.add(new Product("p03","Name 3","3.png",new Date()));
		products.add(new Product("p04","Name 4","4.png",new Date()));
		
		return products;
	}
}
