package com.example.BTCuoiKy.repository;

import com.example.BTCuoiKy.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findOneById(long id) ;
}
