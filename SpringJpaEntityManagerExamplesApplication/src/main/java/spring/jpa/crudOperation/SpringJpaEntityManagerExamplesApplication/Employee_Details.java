package spring.jpa.crudOperation.SpringJpaEntityManagerExamplesApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employee_id")

	private Integer Employee_id;
	private String Employee_name;
	private String Employee_dept;
	private String Employee_email;
	private String Employee_address;
	private String Employee_phone;

	// getters and setters

	public Integer getEmployee_id() {
		return Employee_id;
	}

	public String getEmployee_dept() {
		return Employee_dept;
	}

	public void setEmployee_dept(String employee_dept) {
		Employee_dept = employee_dept;
	}

	public String getEmployee_name() {
		return Employee_name;
	}

	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}

	public String getEmployee_email() {
		return Employee_email;
	}

	public void setEmployee_email(String employee_email) {
		Employee_email = employee_email;
	}

	public String getEmployee_address() {
		return Employee_address;
	}

	public void setEmployee_address(String employee_address) {
		Employee_address = employee_address;
	}

	public String getEmployee_phone() {
		return Employee_phone;
	}

	public void setEmployee_phone(String employee_phone) {
		Employee_phone = employee_phone;
	}

	@Override
	public String toString() {
		return "Employee_Details [Employee_id=" + Employee_id + ", Employee_name=" + Employee_name + ", Employee_dept="
				+ Employee_dept + ", Employee_email=" + Employee_email + ", Employee_address=" + Employee_address
				+ ", Employee_phone=" + Employee_phone + "]";
	}

}
