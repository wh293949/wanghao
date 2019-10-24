package com.dao;

import java.io.Serializable;
import java.util.List;

import com.pojo.Dept;
import com.pojo.Emp;


public class DeptDao extends BaseDao {
         
          public List<Object[]> find(){
        	  List<Object[]> list=this.currentSession().createQuery("from Dept d inner join d.emps").list();
              return list;
          }
          public void save(Dept dept){
        	  this.currentSession().save(dept);
          }
}
