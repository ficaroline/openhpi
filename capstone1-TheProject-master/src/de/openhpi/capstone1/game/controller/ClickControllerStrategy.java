package de.openhpi.capstone1.game.controller;

import de.openhpi.capstone1.game.model.Counter;

public class ClickControllerStrategy {
	
	private Controller clickController1;
	private Controller clickController2;

	
	public ClickControllerStrategy(Counter counter) {
		this.clickController1 = new ClickController1(counter);
		this.clickController2 = new ClickController2(counter);
	}
	
	public void handleEvent() {
		/*
		if () {
			clickController1.handleEvent();

		} else {
			clickController2.handleEvent();

		}
		*/
	}

}
