package net.javaguides.springboot;

import net.javaguides.springboot.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Yashmi");
//		employee.setLastName("Kumarasiri");
//		employee.setEmailId("yashmi@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Ridmi");
//		employee1.setLastName("Sathsarani");
//		employee1.setEmailId("sath@gmail.com");
//		employeeRepository.save(employee1);
	}
}
