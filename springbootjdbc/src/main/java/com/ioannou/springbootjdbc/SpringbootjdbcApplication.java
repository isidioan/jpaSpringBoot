package com.ioannou.springbootjdbc;

import com.ioannou.springbootjdbc.dao.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootjdbcApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootjdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      logger.info("Users {}" , dao.findAll());
      logger.info("One User {}", dao.findById(10001));
      logger.info("User names {}", dao.findAllOnlyName());
        logger.info("{} users deleted", dao.deleteById(10002));
    }
}

