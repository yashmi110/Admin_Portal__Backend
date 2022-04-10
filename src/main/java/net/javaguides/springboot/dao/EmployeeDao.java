package net.javaguides.springboot.dao;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository <Employee,Long> {
    //all crud database methods
}
