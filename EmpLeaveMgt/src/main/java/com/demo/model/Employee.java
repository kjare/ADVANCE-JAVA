package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leavedetails")
public class Employee {
	@Id
	private int leave_id;
	private int empno;
	private Date startdate;
	private Date enddate;
	private String leavetype;
	private String leavereason;
	public Employee() {
		super();
	}
	
	
	
	public Employee(int leave_id, int empno, Date startdate, Date enddate, String leavetype, String leavereason) {
		super();
		this.leave_id = leave_id;
		this.empno = empno;
		this.startdate = startdate;
		this.enddate = enddate;
		this.leavetype = leavetype;
		this.leavereason = leavereason;
	}



	public Employee(int empno, Date enddate , String leavereason, String leavetype, Date startdate) {
		super();
		this.empno = empno;
		this.startdate = startdate;
		this.enddate = enddate;
		this.leavetype = leavetype;
		this.leavereason = leavereason;
	}
	
	
	
	public int getLeave_id() {
		return leave_id;
	}



	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}



	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getLeavereason() {
		return leavereason;
	}
	public void setLeavereason(String leavereason) {
		this.leavereason = leavereason;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", startdate=" + startdate + ", enddate=" + enddate + ", leavetype="
				+ leavetype + ", leavereason=" + leavereason + "]";
	}
	
	



}
