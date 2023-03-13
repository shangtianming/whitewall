package com.demo.mappers;

import com.demo.pojo.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeesMapper {
    List<Employees> getEmployeesList(int num);

    Employees getEmployees(int empNo);

    int insertEmployees(Employees employees);

    int updateEmployees(Employees employees);

    int deleteEmployees(int empNo);
}
