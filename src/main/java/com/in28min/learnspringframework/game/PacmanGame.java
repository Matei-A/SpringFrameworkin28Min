package com.in28min.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("up pacman");
		
	}

	@Override
	public void down() {
		System.out.println("down pacman");
		
	}

	@Override
	public void left() {
		System.out.println("left pacman");
		
	}

	@Override
	public void right() {
		System.out.println("right pacman");
		
	}

}
