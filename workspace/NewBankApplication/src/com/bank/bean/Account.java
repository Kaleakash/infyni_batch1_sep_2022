package com.bank.bean;

public class Account {
private int accno;
private String cname;
private float amount;

public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int accno, String cname, float amount) {
	super();
	this.accno = accno;
	this.cname = cname;
	this.amount = amount;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}



}
