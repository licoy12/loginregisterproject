package com.springboot.web.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityCrudRepository extends CrudRepository<UserEntity, Long> {
}
