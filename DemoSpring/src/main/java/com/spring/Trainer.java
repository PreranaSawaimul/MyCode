package com.spring;

public class Trainer {
private String tname;

@Override
public String toString() {
	return "Trainer [tname=" + tname + "]";
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public Trainer(String tname) {
	super();
	this.tname = tname;
}

public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}
}
