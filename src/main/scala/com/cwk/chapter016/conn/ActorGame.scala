package com.cwk.chapter016.conn

import akka.actor.{ActorRef, ActorSystem, Props}

object ActorGame extends App {


  val actorFoctory = ActorSystem("actorfactory")

  val bActorRef: ActorRef = actorFoctory.actorOf(Props[BActor],"bActor")

  val aActorRef: ActorRef = actorFoctory.actorOf(Props(new AActor(bActorRef)),"aActor")

  aActorRef ! "start"

}
