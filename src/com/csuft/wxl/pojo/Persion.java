package com.csuft.wxl.pojo;

public class Persion {
	private int id;
	private String name;
	private String birthday;
	private int sex;
	private String department;
	private Salary salary;

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Persion [id=" + id + ", name=" + name + ", birthday=" + birthday + ", sex=" + sex + ", department="
				+ department + ", salary=" + salary + "]";
	}

	public Persion() {

	}

	public Persion(int id, String name, String i, int sex, String department) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = i;
		this.sex = sex;
		this.department = department;
	}

}
