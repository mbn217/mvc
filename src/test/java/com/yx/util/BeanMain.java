package com.yx.util;

import java.io.IOException;
import java.sql.SQLException;

/**
 * User: NMY
 * Date: 17-6-12
 */
public class BeanMain {

    public static final String URL = "jdbc:mysql://192.168.1.171:3306/test";

    public static void main(String[] args) throws IOException, SQLException {
        GenerateBean.generateBean("test");
        GenerateBean.generateBean("test", "person");
        GenerateMapper.generateBean("test");
        GenerateBeanRespMapper.generateBean("test");
        GenerateSelectAll.generateFields("test", "person");
    }
}
