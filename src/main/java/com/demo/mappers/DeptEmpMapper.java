package com.demo.mappers;

import com.demo.pojo.DeptEmp;
import com.demo.pojo.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @ClassName: DeptEmpMapper
 * @Author: whitewall
 * @Date: 2023/3/12 18:25
 */
@Mapper
@Repository
public interface DeptEmpMapper {
    List<DeptEmp> getDeptEmpList(int num);

    DeptEmp getDeptEmpByEmpNo(int empNo);

    DeptEmp getDeptEmpByDeptNo(String deptNo);
}
