package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pojo.Dept;
import com.pojo.Emp;
import com.service.DeptService;
import com.service.EmpService;
import com.service.impl.DeptServiceImpl;
import com.service.impl.EmpServiceImpl;

public class Test1 {
	Emp emp=new Emp();
	@Test
	public void test() {
		EmpService objEmpService=new EmpServiceImpl();
		emp.setEname("test2");
		emp.setJob("保安部");
		objEmpService.saveService(emp);
	}
	@Test
	public void test2() {
		Dept dept=new Dept();
		dept.setDeptNo((byte)20);
		dept.setdName("研发部");
		DeptService obj=new DeptServiceImpl();
		emp.setEname("villy");
		emp.setJob("软件师");
		dept.getEmps().add(emp);
		obj.saveService(dept);
	}
}
