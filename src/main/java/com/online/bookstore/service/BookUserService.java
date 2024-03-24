package com.online.bookstore.service;

import java.util.Set;

import com.online.bookstore.entity.Book;
import com.online.bookstore.entity.Customer;

public interface BookUserService {

	Set<Book> getBooksPurchasedBy(Customer customer);

}
