package com.ioannou.springbootjdbc.mappers;

import com.ioannou.springbootjdbc.entity.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person(resultSet.getInt("ID"),
                resultSet.getString("NAME"), resultSet.getString("LOCATION"),
                resultSet.getTimestamp("BIRTH_DATE"));
        return person;
    }
}
