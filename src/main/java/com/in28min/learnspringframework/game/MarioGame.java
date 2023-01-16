package com.in28min.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class MarioGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Jump");
	}
	@Override
	public void down() {
		System.out.println("Duck");
	}
	@Override
	public void left() {
		System.out.println("Go left");
	}
	@Override
	public void right() {
		System.out.println("Go right");
	}
	
	
}
