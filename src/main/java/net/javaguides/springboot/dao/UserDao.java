package net.javaguides.springboot.dao;

import net.javaguides.springboot.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
