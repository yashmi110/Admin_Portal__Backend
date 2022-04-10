package net.javaguides.springboot.controller;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeDao.findAll();
    }

    //build create employee rest API
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return  employeeDao.save(employee);
    }

    //Get employee by ID
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable  long id){
        Employee employee = employeeDao.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id: "+ id));
        return ResponseEntity.ok(employee);
    }

    //Update Employee Rest API

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee( @PathVariable long id, @RequestBody Employee employeeDetails){
        Employee updateEmployee = employeeDao.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id: "+ id));

        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());

        employeeDao.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);

    }
    //build delete employee REST API
@DeleteMapping("{id}")
public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){

        Employee employee = employeeDao.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee not exists with id: "+id));
        employeeDao.delete(employee);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
