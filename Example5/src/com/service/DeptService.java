package com.service;

import java.util.List;

import com.pojo.Dept;

public interface DeptService {
	public List<Object[]> findService();
	public void saveService(Dept dept);
	 
}
