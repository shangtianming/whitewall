package org.companyname.service;

import org.companyname.dao.EmployeesMapper;
import org.companyname.pojo.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Resource
    private EmployeesMapper employeesMapper;

    @Override
    public List<Employees> getEmployeesList(int num) {
        return null;
    }

    @Override
    public Employees getEmployeesById(int emp_no) {
        return employeesMapper.getEmployeesById(emp_no);
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
