package com.codeprince.employeemanagementsystem.repositories;

import com.codeprince.employeemanagementsystem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
