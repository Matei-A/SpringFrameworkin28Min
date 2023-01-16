package com.in28min.learnspringframework;

import java.io.Serializable;

public class Pojo {
 
	private String text;
	private int number;
	public String toString() {
		return text + ":" + number;
	}
}

class JavaBean implements Serializable { // EJB
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//public no-arg constructor
	public JavaBean() {
		
	}
	
	private String text;
	private int number;

	//getters and setters
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
