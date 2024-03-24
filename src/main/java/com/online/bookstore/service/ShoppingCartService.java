package com.online.bookstore.service;

//import java.util.Collection;
//import java.util.List;
import java.util.Set;

import com.online.bookstore.entity.Book;
import com.online.bookstore.entity.Customer;
import com.online.bookstore.entity.ShoppingCart;

public interface ShoppingCartService {

	public Set<ShoppingCart> getAllItems(Customer customer);
		
	public String addItem(Customer customer, Book book);

	public String increaseItem(Customer customer, Book book, int count);
	
	public String removeItem(Customer customer, Book book);

	String decreaseItem(Customer customer, Book book, int count);

	public Set<ShoppingCart> getByUsername(Customer customer);
	
}
