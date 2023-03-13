package org.companyname;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void testLoads() throws SQLException {
        System.out.println(dataSource);
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
    }
}
