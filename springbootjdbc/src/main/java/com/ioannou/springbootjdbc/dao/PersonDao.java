package com.ioannou.springbootjdbc.dao;

import com.ioannou.springbootjdbc.entity.Person;
import com.ioannou.springbootjdbc.mappers.PersonRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * from person", new PersonRowMapper());
    }

    public List<String> findAllOnlyName() {
        return jdbcTemplate.queryForList("SELECT name from person", String.class);
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class));
    }

    public int deleteById(int id) {

        return jdbcTemplate.update("delete from PERSON where ID=?", id);
    }

    public int insertPerson(Person p) {
        return jdbcTemplate.update("INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES ( ?, ?, ?, ? )",
                p.getId(), p.getName(), p.getLocation(), new Timestamp(p.getBirthDate().getTime()));
    }

    public int updatePerson(Person p) {

        return jdbcTemplate.update("UPDATE PERSON SET NAME = ?, LOCATION = ?, BIRTH_DATE = ? where ID = ?"
                , p.getName(), p.getLocation(), new Timestamp(p.getBirthDate().getTime()), p.getId());
    }
}
