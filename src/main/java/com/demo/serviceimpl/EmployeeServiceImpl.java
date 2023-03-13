package com.demo.serviceimpl;

import com.demo.mappers.EmployeesMapper;
import com.demo.pojo.Employees;
import com.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeesMapper employeesMapper;

    @Override
    public List<Employees> getEmployeesList(int num) {
        return null;
    }

    @Override
    public Employees getEmployees(Integer empNo) {
        Employees employees= employeesMapper.getEmployees(empNo);
        System.out.println("== "+employees.toString());
        return employees;
    }

    @Override
    public int insertEmployees(Employees employees) {
        return 0;
    }

    @Override
    public int updateEmployees(Employees employees) {
        return 0;
    }

    @Override
    public int deleteEmployees(int emp_no) {
        return 0;
    }
}
