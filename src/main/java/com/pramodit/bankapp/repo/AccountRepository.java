package com.pramodit.bankapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pramodit.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
	
}
