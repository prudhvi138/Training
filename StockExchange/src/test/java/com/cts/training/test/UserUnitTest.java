package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;
import com.cts.training.model.User;

public class UserUnitTest {

	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	private static User user;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user = (User) context.getBean("user");
		userDAO = (UserDAO) context.getBean("userDAO");
	}

	
	/*
	 * @Test public void testGetAllUsers() { List<User> users =
	 * userDAO.getAllUsers(); assertEquals(3,users.size()); }
	 */
	@Test
	public void testSaveUser() {
		User u = new User(106, "mahesh", "mahesh56", "mahesh@gmail.com", 67899904, false);
		assertEquals(true, userDAO.saveUser(u));
	}

	
	  @Test public void test_update_user_success() { User u=
	  userDAO.getUserById(104); u.setEmail("ram123@gmail.com");
	  assertEquals(true,userDAO.updateUser(u)); }
	 
	
	  @Test public void testDeleteUser() { User u = userDAO.getUserById(105);
	  assertEquals(true,userDAO.deleteUser(u)); }
	 

}
