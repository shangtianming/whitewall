package com.demo.controller;

import com.demo.pojo.Employees;
import com.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp")
public class EmployeesController  {
    // Autowired：自动装配，无需手动创建对象。默认类型（byType）查找
    // 如果存在相同类型，可以配合byname的注解@Qualifier来避免
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/{id}")
    public Employees getById(@PathVariable(name = "id") Integer id) {
        System.out.println("== id "+id);
        return employeeService.getEmployees(id);
    }
}
