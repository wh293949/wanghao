package com.service.impl;

import java.util.List;

import org.hibernate.Transaction;

import com.dao.DeptDao;
import com.dao.EmpDao;
import com.dao.HibernateUtil;
import com.pojo.Dept;
import com.pojo.Emp;
import com.service.DeptService;

public class DeptServiceImpl implements DeptService{
   DeptDao  objDeptDao=new DeptDao();
   EmpDao  objEmpDao=new  EmpDao();
   @Override
    public List<Object[]> findService() {
    	Transaction tx = null;
    	List<Object[]> list=null;
        try {
            tx = HibernateUtil.currentSession().beginTransaction();
            list=objDeptDao.find();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        }
        return list;
}
@Override
public void saveService(Dept dept) {
	Transaction tx = null;
    try {
        tx = HibernateUtil.currentSession().beginTransaction();
        objDeptDao.save(dept);
        tx.commit();
    } catch (Exception e) {
        e.printStackTrace();
        if (tx != null)
            tx.rollback();
    }
	
}
	  

}
