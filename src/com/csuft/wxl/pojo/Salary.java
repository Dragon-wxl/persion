package com.csuft.wxl.pojo;

import java.util.List;

public class Salary {
	private int id;
	private String department;
	private int wage;
	private int rank;
	private Level level;
	private List<Persion> persion;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public List<Persion> getPersion() {
		return persion;
	}

	public void setPersion(List<Persion> persion) {
		this.persion = persion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", department=" + department + ", wage=" + wage + ", rank=" + rank + ", level="
				+ level + ", persion=" + persion + "]";
	}

}
