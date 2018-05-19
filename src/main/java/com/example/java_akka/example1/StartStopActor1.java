package com.example.java_akka.example1;

import akka.actor.AbstractActor;
import akka.actor.Props;

public class StartStopActor1 extends AbstractActor {

	@Override
	public void preStart() {
		System.out.println("first actor started");
		getContext().actorOf(Props.create(StartStopActor2.class), "second");	
	}
	
	@Override
	public void postStop() {
		System.out.println("first actor stopped");
	}
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.matchEquals("stop", s ->{
					getContext().stop(getSelf());
				})
				.build();
	}
}
