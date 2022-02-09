package com.ait;

public class Trainer {
private String trainername;

public String getTrainername() {
	return trainername;
}

public void setTrainername(String trainername) {
	this.trainername = trainername;
}

public Trainer(String trainername) {
	super();
	this.trainername = trainername;
}

public Trainer() {
	super();
	System.out.println("trainerrrrrrrrrrrrrr");
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Trainer [trainername=" + trainername + "]";
}


}
