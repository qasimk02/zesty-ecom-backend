package com.zesty.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zesty.ecom.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByEmail(String email);

}