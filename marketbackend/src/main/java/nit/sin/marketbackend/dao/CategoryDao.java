package nit.sin.marketbackend.dao;

import java.util.List;

import nit.sin.marketbackend.dto.Category;

public interface CategoryDao {

		
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}