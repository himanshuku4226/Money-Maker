package com.money.MoneyMaker.table;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taskcomplete")
public class taskcomplete {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	private int  taskid;
	 private int user_id;
	 private int app_id;
	 private String taskname;
	 private int getcoin;
	 private Date completeddate;
	public taskcomplete() {
		super();
		
	}
	public taskcomplete(int taskid, int user_id, int app_id, String taskname, int getcoin, Date completeddate) {
		super();
		this.taskid = taskid;
		this.user_id = user_id;
		this.app_id = app_id;
		this.taskname = taskname;
		this.getcoin = getcoin;
		this.completeddate = completeddate;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getApp_id() {
		return app_id;
	}
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public int getGetcoin() {
		return getcoin;
	}
	public void setGetcoin(int getcoin) {
		this.getcoin = getcoin;
	}
	public Date getCompleteddate() {
		return completeddate;
	}
	public void setCompleteddate(Date completeddate) {
		this.completeddate = completeddate;
	}
	
	
	 

}
