package org.companyname.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    public int id;
    private String name;

    public void aaa(){};
    private String bbb(String a,int b){return a;}
    public String ccc(String a){return a;}

}
