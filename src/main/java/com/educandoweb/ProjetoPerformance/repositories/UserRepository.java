package com.educandoweb.ProjetoPerformance.repositories;

import com.educandoweb.ProjetoPerformance.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
