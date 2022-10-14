package com.example.demo.adminlogin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AdminRepository extends JpaRepository<Adminuser, Integer> {
	 Adminuser findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);

	Optional<Adminuser> findById(long id);
}
