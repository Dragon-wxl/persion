package com.csuft.wxl.pojo;

import java.util.List;

public class Level {
	private int id;
	private int rank;
	private String define;
	private List<Salary> salary;

	public List<Salary> getSalary() {
		return salary;
	}

	public void setSalary(List<Salary> salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getDefine() {
		return define;
	}

	public void setDefine(String define) {
		this.define = define;
	}

	@Override
	public String toString() {
		return "Level [id=" + id + ", rank=" + rank + ", define=" + define + ", salary=" + salary + "]";
	}

}
