package com.yx.dao;

import com.yx.bean.Person;
import com.yx.mapper.PersonMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class PersonDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<Person> queryPersons() {
        String sql = "SELECT `id`, `name` FROM `person`";
        return jdbcTemplate.query(sql, new PersonMapper());
    }

    public Person queryPersonById(int id) {
        String sql = "SELECT `id`, `name` FROM `person` WHERE `id` = ?";
        List<Person> list = jdbcTemplate.query(sql, new PersonMapper(), id);
        if (list.size() > 0) {
            return list.get(0);
        }

        return null;
    }
}
