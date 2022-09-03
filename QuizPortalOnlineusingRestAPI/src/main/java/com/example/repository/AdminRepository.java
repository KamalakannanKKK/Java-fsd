package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Adminuser;
public interface AdminRepository extends JpaRepository<Adminuser, Integer> {
	 Adminuser findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);

	Optional<Adminuser> findById(long id);
}
