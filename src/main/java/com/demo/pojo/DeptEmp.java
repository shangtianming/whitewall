package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptEmp {
    // 员工编号
    private Integer empNo;
    // 部门编号
    private String deptNo;
    // 入职日期
    private Date fromDate;
    // 离职日期
    private Date toDate;

}
