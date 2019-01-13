package kosta.model.module.vo.schedule;

import java.io.Serializable;

public class Employee implements Serializable{
	private long emp_id;

	public Employee() {
	}

	public Employee(long empId) {
		super();
		this.emp_id = empId;
	}

	public long getEmpId() {
		return emp_id;
	}

	public void setEmpId(long empId) {
		this.emp_id = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + emp_id + "]";
	}
	
	
}
