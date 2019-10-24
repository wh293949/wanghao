package com.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
@Entity
@Table(name="SCOTT.DEPT")
public class Dept implements Serializable{
	       @Id
	       @Column(name="DEPTNO")
          private Byte deptNo;
	       @Column(name="DNAME")
          private String dName;
	       @Column(name="LOC")
          private String loc;
	       @OneToMany(mappedBy="dept",cascade={CascadeType.ALL})
          private Set<Emp> emps=new HashSet<Emp>();
          
		public Set<Emp> getEmps() {
			return emps;
		}
		public void setEmps(Set<Emp> emps) {
			this.emps = emps;
		}
		public Byte getDeptNo() {
			return deptNo;
		}
		public void setDeptNo(Byte deptNo) {
			this.deptNo = deptNo;
		}
		public String getdName() {
			return dName;
		}
		public void setdName(String dName) {
			this.dName = dName;
		}
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
          
}
