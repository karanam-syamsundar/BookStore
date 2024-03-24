package com.online.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.online.bookstore.entity.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, String> {

}
