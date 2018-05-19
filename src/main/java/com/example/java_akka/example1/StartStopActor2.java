package com.example.java_akka.example1;

import akka.actor.AbstractActor;

public class StartStopActor2 extends AbstractActor {

	@Override
	public void preStart() {
		System.out.println("second actor started");
	}
	
	@Override
	public void postStop() {
		System.out.println("second actor stopped");
	}
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.build();
	}
}
