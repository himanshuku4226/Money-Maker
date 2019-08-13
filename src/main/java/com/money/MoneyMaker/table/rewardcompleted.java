package com.money.MoneyMaker.table;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rewardcompleted")
public class rewardcompleted {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	private int  rewacomid;
	 private int userid;
	 private int rewardid;
	 private String rewardname;
	 private int rewardamount;
	 private Date completeddate;
	 private String rewardcode;
	public rewardcompleted() {
		super();
		// TODO Auto-generated constructor stub
	}
	public rewardcompleted(int rewacomid, int userid, int rewardid, String rewardname, int rewardamount,
			Date completeddate, String rewardcode) {
		super();
		this.rewacomid = rewacomid;
		this.userid = userid;
		this.rewardid = rewardid;
		this.rewardname = rewardname;
		this.rewardamount = rewardamount;
		this.completeddate = completeddate;
		this.rewardcode = rewardcode;
	}
	public int getRewacomid() {
		return rewacomid;
	}
	public void setRewacomid(int rewacomid) {
		this.rewacomid = rewacomid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getRewardid() {
		return rewardid;
	}
	public void setRewardid(int rewardid) {
		this.rewardid = rewardid;
	}
	public String getRewardname() {
		return rewardname;
	}
	public void setRewardname(String rewardname) {
		this.rewardname = rewardname;
	}
	public int getRewardamount() {
		return rewardamount;
	}
	public void setRewardamount(int rewardamount) {
		this.rewardamount = rewardamount;
	}
	public Date getCompleteddate() {
		return completeddate;
	}
	public void setCompleteddate(Date completeddate) {
		this.completeddate = completeddate;
	}
	public String getRewardcode() {
		return rewardcode;
	}
	public void setRewardcode(String rewardcode) {
		this.rewardcode = rewardcode;
	}
	 

}
