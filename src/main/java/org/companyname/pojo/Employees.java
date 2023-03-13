package org.companyname.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
    private Integer emp_no;
    private Date birth_date;
    private String first_name;
    private String last_name;
    private Gender gender;
    private Date hire_date;
}
