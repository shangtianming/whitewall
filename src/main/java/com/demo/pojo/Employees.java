package com.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "employees")
public class Employees {
//    @Id
//    @Column(name = "emp_no")
    private Integer empNo;

//    @Column(name = "birth_date")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthDate;

//    @Column(name = "first_name")
    private String firstName;

//    @Column(name = "last_name")
    private String lastName;

//    @Column(name = "gender")
    private Gender gender;

//    @Column(name = "hire_date")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date hireDate;
}
