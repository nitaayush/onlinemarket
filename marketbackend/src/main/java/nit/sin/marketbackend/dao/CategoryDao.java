package nit.sin.marketbackend.dao;

import java.util.List;

import nit.sin.marketbackend.dto.Category;

public interface CategoryDao {

	
	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
	
}