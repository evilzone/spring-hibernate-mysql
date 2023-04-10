package com.springhibernatemysql.springhibernatemysql.repository;

import com.springhibernatemysql.springhibernatemysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
