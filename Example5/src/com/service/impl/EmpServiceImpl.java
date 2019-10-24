package com.service.impl;

import org.hibernate.Transaction;

import com.dao.EmpDao;
import com.dao.HibernateUtil;
import com.pojo.Emp;
import com.service.EmpService;

public class EmpServiceImpl implements EmpService{
  EmpDao objEmpDao=new EmpDao();
	@Override
	public void saveService(Emp emp) {
		Transaction tx = null;
        try {
            tx = HibernateUtil.currentSession().beginTransaction();
            objEmpDao.save(emp);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        }
		
	}

}
