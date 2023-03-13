package org.companyname.service;

import org.companyname.dao.EmployeesMapper;
import org.companyname.pojo.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeesService   {
    List<Employees> getEmployeesList(int num);

    Employees getEmployeesById(int emp_no);

    int insertEmployees(Employees employees);

    int updateEmployees(Employees employees);

    int deleteEmployees(int emp_no);
}
