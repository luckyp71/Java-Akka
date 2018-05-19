package com.example.java_akka.example1;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Main {

	public static void main (String[] args) {
		
		ActorSystem system = ActorSystem.create("mainSystem");
		
		ActorRef first = system.actorOf(Props.create(StartStopActor1.class),"first");
		first.tell("stop", ActorRef.noSender());
	}
}
