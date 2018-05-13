package com.nuc.mybatis.dao;


import com.nuc.mybatis.bean.Employee;

import java.util.List;



public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();
	

}
