package com.money.MoneyMaker.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rewardtask")
public class rewardtask {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 private int rewardid;
	 private String rewardname;
	 private String rewarddescription;
	 private int rewardamount;
	 private long spendcoin;
	 private boolean live;
	public rewardtask() {
		super();
		// TODO Auto-generated constructor stub
	}
	public rewardtask(int rewardid, String rewardname, String rewarddescription, int rewardamount, long spendcoin,
			boolean live) {
		super();
		this.rewardid = rewardid;
		this.rewardname = rewardname;
		this.rewarddescription = rewarddescription;
		this.rewardamount = rewardamount;
		this.spendcoin = spendcoin;
		this.live = live;
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
	public String getRewarddescription() {
		return rewarddescription;
	}
	public void setRewarddescription(String rewarddescription) {
		this.rewarddescription = rewarddescription;
	}
	public int getRewardamount() {
		return rewardamount;
	}
	public void setRewardamount(int rewardamount) {
		this.rewardamount = rewardamount;
	}
	public long getSpendcoin() {
		return spendcoin;
	}
	public void setSpendcoin(long spendcoin) {
		this.spendcoin = spendcoin;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	 
}
