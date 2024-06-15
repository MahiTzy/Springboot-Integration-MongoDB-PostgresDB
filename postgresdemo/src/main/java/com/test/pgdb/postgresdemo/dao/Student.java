package com.test.pgdb.postgresdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Student {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable() {
        int update = this.jdbcTemplate.update("CREATE TABLE stu (id SERIAL PRIMARY KEY, name VARCHAR(255), age INTEGER)");
        System.out.println(update);
    }
}
