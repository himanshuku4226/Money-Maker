package com.money.MoneyMaker.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="applist")
public class applist {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 private int appid;
	 private String appname;
	 private String appdescription;
	 private int appcoin;
	 private boolean live;
	 private String applink;
	public applist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public applist(int appid, String appname, String appdescription, int appcoin, boolean live, String applink) {
		super();
		this.appid = appid;
		this.appname = appname;
		this.appdescription = appdescription;
		this.appcoin = appcoin;
		this.live = live;
		this.applink = applink;
	}
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public String getAppdescription() {
		return appdescription;
	}
	public void setAppdescription(String appdescription) {
		this.appdescription = appdescription;
	}
	public int getAppcoin() {
		return appcoin;
	}
	public void setAppcoin(int appcoin) {
		this.appcoin = appcoin;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public String getApplink() {
		return applink;
	}
	public void setApplink(String applink) {
		this.applink = applink;
	}
	 

}
