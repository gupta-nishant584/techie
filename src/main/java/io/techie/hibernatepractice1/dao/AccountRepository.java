package io.techie.hibernatepractice1.dao;

import io.techie.hibernatepractice1.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByEmployeeId(Long employeeId);
}
