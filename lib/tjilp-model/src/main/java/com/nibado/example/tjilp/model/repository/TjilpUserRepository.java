package com.nibado.example.tjilp.model.repository;

import com.nibado.example.tjilp.model.TjilpUser;
import org.springframework.data.repository.CrudRepository;

public interface TjilpUserRepository extends CrudRepository<TjilpUser, String> {
}
