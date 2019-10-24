package com.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="SCOTT.EMP")
public class Emp implements Serializable {
	//员工编号
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_emp")
	@SequenceGenerator(name="seq_emp",sequenceName="seq_emp",allocationSize=10,initialValue=1)	
	private int empno;
	@Column(name="ENAME")
	private String ename;
	@Column(name="JOB")
	private String job;
	@Column(name="MGR")
	private Integer mgr;
	@Column(name="HIREDATE")
	private Date hireDate;
	@Column(name="SAL")
	private Double sal;
	@Column(name="COMM")
	private Double comm;
	
	//private int deptno;
	//多对一更新 员工-->部门
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DEPTNO")
	private Dept dept;
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
//	public int getDeptno() {
//		return deptno;
//	}
//	public void setDeptno(int deptno) {
//		this.deptno = deptno;
//	}
	

}
