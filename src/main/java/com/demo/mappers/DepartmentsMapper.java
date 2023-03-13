package com.demo.mappers;

import com.demo.pojo.Departments;
import com.demo.pojo.DeptEmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @ClassName: DepartmentsMapper
 * @Author: whitewall
 * @Date: 2023/3/12 19:01
 */
@Mapper
@Repository
public interface DepartmentsMapper {
    List<Departments> getDepartmentsList(int num);

    Departments getDeptEmpByDeptNo(int deptNo);

}
