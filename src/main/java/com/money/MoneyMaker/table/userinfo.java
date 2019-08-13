package com.money.MoneyMaker.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userinfo")
public class userinfo {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 private int userid;
	private String uname;
	 private String uemail;
	 private long umobile;
	 private int currentballence;
	 private long totalearn;
	 private String referalcode;
	 private String f_referal;
	 
	public userinfo() {
		super();
	}
	

	public userinfo(String uname, String uemail, long umobile, int currentballence, long totalearn, String referalcode,
			String f_referal) {
		super();
		this.uname = uname;
		this.uemail = uemail;
		this.umobile = umobile;
		this.currentballence = currentballence;
		this.totalearn = totalearn;
		this.referalcode = referalcode;
		this.f_referal = f_referal;
	}


	public userinfo(int userid, String uname, String uemail, long umobile, int currentballence, long totalearn,
			String referalcode, String f_referal) {
		super();
		this.userid = userid;
		this.uname = uname;
		this.uemail = uemail;
		this.umobile = umobile;
		this.currentballence = currentballence;
		this.totalearn = totalearn;
		this.referalcode = referalcode;
		this.f_referal = f_referal;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public long getUmobile() {
		return umobile;
	}

	public void setUmobile(long umobile) {
		this.umobile = umobile;
	}

	public int getCurrentballence() {
		return currentballence;
	}

	public void setCurrentballence(int currentballence) {
		this.currentballence = currentballence;
	}

	public long getTotalearn() {
		return totalearn;
	}

	public void setTotalearn(long totalearn) {
		this.totalearn = totalearn;
	}

	public String getReferalcode() {
		return referalcode;
	}

	public void setReferalcode(String referalcode) {
		this.referalcode = referalcode;
	}

	public String getF_referal() {
		return f_referal;
	}

	public void setF_referal(String f_referal) {
		this.f_referal = f_referal;
	}
	
	

}
