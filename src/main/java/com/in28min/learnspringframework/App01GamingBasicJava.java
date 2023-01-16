package com.in28min.learnspringframework;

import com.in28min.learnspringframework.game.GameRunner;
import com.in28min.learnspringframework.game.MarioGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
