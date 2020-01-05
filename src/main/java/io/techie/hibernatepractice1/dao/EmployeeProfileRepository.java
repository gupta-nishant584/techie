package io.techie.hibernatepractice1.dao;

import io.techie.hibernatepractice1.entity.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long> {
}
