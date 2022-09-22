package spring.jpa.crudOperation.SpringJpaEntityManagerExamplesApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaEntityManagerExamplesApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaEntityManagerExamplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		createEmployee_Details();
		updateEmployee_Details();
		deleteEmployee_Details();
		listEmployee_Details();
		getEmployee_Details();
	}

	private void deleteEmployee_Details() {
		Integer Employee_id = 15;
		repo.delete(Employee_id);
	}

	private void updateEmployee_Details() {
		Integer Employee_id = 1;
		Employee_Details Employee_Details = repo.findById(Employee_id);
		Employee_Details.setEmployee_address(" Chennai GT");

		repo.update(Employee_Details);
	}

	private void getEmployee_Details() {
		Integer Employee_id = 1;
		Employee_Details Employee_Details = repo.findById(Employee_id);

		System.out.println(Employee_Details);
	}

	private void createEmployee_Details() {

		Employee_Details newEmployee_Details = new Employee_Details();

		newEmployee_Details.setEmployee_name("Babul Prasad");
		newEmployee_Details.setEmployee_dept("Incomm");
		newEmployee_Details.setEmployee_email("babulprasad@fss.co.in");
		newEmployee_Details.setEmployee_address("Noida GT");
		newEmployee_Details.setEmployee_phone("8939478362");

		repo.save(newEmployee_Details);
	}

	private void listEmployee_Details() {

		List<Employee_Details> listEmployee_Details = repo.findAll();
		listEmployee_Details.forEach(System.out::println);
	}

}