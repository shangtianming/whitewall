package com.demo.service;

import com.demo.pojo.Employees;

import java.util.List;

public interface EmployeeService {
    List<Employees> getEmployeesList(int num);

    Employees getEmployees(Integer empNo);

    int insertEmployees(Employees employees);

    int updateEmployees(Employees employees);

    int deleteEmployees(int empNo);
}
