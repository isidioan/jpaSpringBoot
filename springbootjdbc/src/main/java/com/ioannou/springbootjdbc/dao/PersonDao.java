package com.ioannou.springbootjdbc.dao;

import com.ioannou.springbootjdbc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    public List<String> findAllOnlyName() {
        return jdbcTemplate.queryForList("SELECT name from person", String.class);
    }

    public Person findById(int id) {
       return jdbcTemplate.queryForObject("SELECT * FROM person where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class));
    }
}
