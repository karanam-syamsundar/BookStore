package com.online.bookstore.service;

import java.util.Set;

import com.online.bookstore.entity.Customer;
import com.online.bookstore.entity.PurchaseDetail;
import com.online.bookstore.entity.PurchaseHistory;

public interface PaymentService {

	String createTransaction(Customer customer);
	
	Set<PurchaseHistory> getPurchaseHistories(Customer customer);
	
	Set<PurchaseDetail> getPurchaseDetails(PurchaseHistory purchaseHistory);

	PurchaseHistory getPurchaseHistory(Customer customer, String transId);
}
