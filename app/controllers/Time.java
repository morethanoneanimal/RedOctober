package controllers;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.Navigation;

public class Time extends TimerTask{

private static final int RATE = 2000;
private static final int START_DELAY = 2000;

private ConcurrentLinkedQueue<Navigation> queue;
private GameController controller;

	public Time(ConcurrentLinkedQueue<Navigation> queue, GameController controller){
		this.queue = queue;
		this.controller = controller;
	}
	
	public void startTimer(){
		Timer t = new Timer();
		t.scheduleAtFixedRate(this, START_DELAY, RATE);
	}

	@Override
	public void run() {
		while(!queue.isEmpty()){
			Navigation item = queue.remove();
			System.out.println("Processing:"+item.toString());
			//TODO Change boat position
		}
		controller.broadcast();
	}

}
