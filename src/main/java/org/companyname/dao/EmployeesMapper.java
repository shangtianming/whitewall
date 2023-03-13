package org.companyname.dao;

import org.apache.ibatis.annotations.Mapper;
import org.companyname.pojo.Employees;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface EmployeesMapper {
    List<Employees> getEmployeesList(int num);

    Employees getEmployeesById(int emp_no);

    int insertEmployees(Employees employees);

    int updateEmployees(Employees employees);

    int deleteEmployees(int emp_no);
}
