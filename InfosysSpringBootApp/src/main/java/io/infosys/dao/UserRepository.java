package io.infosys.dao;

import org.springframework.data.repository.CrudRepository;

import io.infosys.model.Users;

public interface UserRepository extends CrudRepository<Users, Integer>{

}
