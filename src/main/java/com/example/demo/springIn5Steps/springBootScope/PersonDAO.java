package com.example.demo.springIn5Steps.springBootScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
    @Autowired
    JdbcConnection jdbcConnection;

    public PersonDAO(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}
