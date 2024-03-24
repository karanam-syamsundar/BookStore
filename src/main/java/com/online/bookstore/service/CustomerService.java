package com.online.bookstore.service;

import java.util.List;



import com.online.bookstore.entity.Customer;
import com.online.bookstore.forms.entity.ChangePassword;
import com.online.bookstore.forms.entity.CustomerData;


public interface CustomerService {

	public List<Customer> getAllCustomers();
	
	public Customer getCustomer(String username);
		
	public String saveCustomer(Customer theCustomer);
	
	public String updateCustomer(Customer theCustomer);
	
	public String removeCustomer(Customer theCustomer);
	
	public String registerCustomer(CustomerData data);

	public CustomerData getCustomerData(String username);

	public String updateCustomer(CustomerData customerData);
	
	public String updatePassword(ChangePassword changePassword);
	
}
