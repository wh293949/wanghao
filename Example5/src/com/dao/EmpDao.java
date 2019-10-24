package com.dao;

import java.io.Serializable;

import com.pojo.Emp;

public class EmpDao extends BaseDao{
              public void save(Emp emp){
            	  this.currentSession().save(emp);
              }
              public Emp load(Serializable empNo){
            	  return (Emp) this.currentSession().load(Emp.class, empNo);
              }
              
}
