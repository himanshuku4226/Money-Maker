package com.money.MoneyMaker.table;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transection")
public class transection {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 private int transid;
	 private int userid;
	 private String transectiontype;
	 private int transectioncoin;
	private Date transectiondate;
	public transection() {
		super();
		
	}
	public transection(int transid, int userid, String transectiontype, int transectioncoin, Date transectiondate) {
		super();
		this.transid = transid;
		this.userid = userid;
		this.transectiontype = transectiontype;
		this.transectioncoin = transectioncoin;
		this.transectiondate = transectiondate;
	}
	public int getTransid() {
		return transid;
	}
	public void setTransid(int transid) {
		this.transid = transid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getTransectiontype() {
		return transectiontype;
	}
	public void setTransectiontype(String transectiontype) {
		this.transectiontype = transectiontype;
	}
	public int getTransectioncoin() {
		return transectioncoin;
	}
	public void setTransectioncoin(int transectioncoin) {
		this.transectioncoin = transectioncoin;
	}
	public Date getTransectiondate() {
		return transectiondate;
	}
	public void setTransectiondate(Date transectiondate) {
		this.transectiondate = transectiondate;
	}
	
	

}
