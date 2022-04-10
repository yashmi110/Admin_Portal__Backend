package net.javaguides.springboot.dao;

import net.javaguides.springboot.model.DAOUser;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
