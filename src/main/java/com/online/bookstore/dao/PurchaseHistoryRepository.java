package com.online.bookstore.dao;

import java.util.Set;

//import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.online.bookstore.entity.Customer;
import com.online.bookstore.entity.PurchaseHistory;

@RepositoryRestResource
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, String> {

	@Query("from PurchaseHistory where customer = ?1")
	Set<PurchaseHistory> findAllByCustomer(Customer customer);

}
