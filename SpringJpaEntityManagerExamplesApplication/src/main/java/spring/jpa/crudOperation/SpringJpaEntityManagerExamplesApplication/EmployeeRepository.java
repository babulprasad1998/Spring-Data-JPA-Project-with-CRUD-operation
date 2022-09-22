package spring.jpa.crudOperation.SpringJpaEntityManagerExamplesApplication;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public void save(Employee_Details Employee_Details) {

		entityManager.persist(Employee_Details);

	}

	public List<Employee_Details> findAll() {
		String jpql = "SELECT c FROM Employee_Details c";
		TypedQuery<Employee_Details> query = entityManager.createQuery(jpql, Employee_Details.class);

		return query.getResultList();
	}

	public Employee_Details findById(Integer id) {

		return entityManager.find(Employee_Details.class, id);
	}

	@Transactional
	public Employee_Details update(Employee_Details Employee_Details) {

		return entityManager.merge(Employee_Details);
	}

	@Transactional
	public void delete(Integer Employee_id) {
		Employee_Details Employee_Details = entityManager.find(Employee_Details.class, Employee_id);

		entityManager.remove(Employee_Details);
	}
}
