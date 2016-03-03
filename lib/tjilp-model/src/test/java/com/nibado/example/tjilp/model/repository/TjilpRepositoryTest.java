package com.nibado.example.tjilp.model.repository;


import com.nibado.example.tjilp.model.TestConfig;
import com.nibado.example.tjilp.model.repository.TjilpRepository;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
//@Sql({"tjilp-schema.sql", "tjilp-data.sql"})
public class TjilpRepositoryTest {

    @Autowired
    private TjilpRepository repository;

    @Test
    public void testFindAll() {
        repository.findAll().forEach(System.out::println);
    }
}