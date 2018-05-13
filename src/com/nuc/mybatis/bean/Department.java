package com.nuc.mybatis.bean;

import java.util.List;

/**
 * 描述:部门
 *
 * @author 闫文强
 * @create 2018-05-12 21:48
 */
public class Department {
	private Integer id;
	private String departmentName;
	private List<Employee> emps;

	public Department() {
	}

	public Department(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department{" +
				"id=" + id +
				", departmentName='" + departmentName + '\'' +
				'}';
	}
}