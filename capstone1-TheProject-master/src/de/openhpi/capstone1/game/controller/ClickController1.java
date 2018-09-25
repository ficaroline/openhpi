package de.openhpi.capstone1.game.controller;

import de.openhpi.capstone1.game.model.Counter;

public class ClickController1 implements Controller{
	
	Counter counter;
	
	public ClickController1(Counter counter) { 
		this.counter = counter;
	}

	@Override
	public void handleEvent() {
		// TODO Auto-generated method stub
		
	}

}
