package nit.sin.marketbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nit.sin.marketbackend.dao.CategoryDao;
import nit.sin.marketbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageUrl("CAT_1.png");
		
		categories.add(category);
		
		// adding second category
		category = new Category();	
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile!");
		category.setImageUrl("CAT_2.png");
		
		categories.add(category);
		
		// adding third category
		category = new Category();	
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageUrl("CAT_3.png");
				
		categories.add(category);
		
		
		
		
			
	}
	

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		
		// enhanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
			
		}
		
		return null;
		
		
		
		
	}


	@Override
	@Transactional
	public boolean add(Category category) {
		
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
			
		}
		

	}



}
