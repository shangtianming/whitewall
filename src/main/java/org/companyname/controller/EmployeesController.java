package org.companyname.controller;


import org.companyname.service.EmployeesService;
import org.companyname.pojo.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("emp")
public class EmployeesController {

    @Resource
    private EmployeesService employeesService;

    // GET /users/16
    @GetMapping("/{emp_no}")
    public Employees getEmployeesById(@PathVariable("emp_no") int emp_no) {

        return employeesService.getEmployeesById(emp_no);
    }
}
