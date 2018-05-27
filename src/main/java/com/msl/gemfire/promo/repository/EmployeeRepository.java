package com.msl.gemfire.promo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.msl.gemfire.promo.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

    Employee findByName(String name);

    Iterable<Employee> findBySalaryGreaterThan(double salary);

    Iterable<Employee> findBySalaryLessThan(double salary);

    Iterable<Employee> findBySalaryGreaterThanAndSalaryLessThan(double salary1, double salary2);
}
