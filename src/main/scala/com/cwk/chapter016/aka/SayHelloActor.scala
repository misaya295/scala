package com.cwk.chapter016.aka

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class SayHelloActor extends Actor{


  override def receive: Receive = {


    case "hello" => println("收到hello，回应hello too")
    case "ok" => println("收到hello，回应OK too")
    case _ => println("匹配不到")


  }


}
object SayHelloActorDemo {


  private val actoryFactory = ActorSystem("actoryFactory")

  private val sayHelloAcorRef1: ActorRef =  actoryFactory.actorOf(Props[SayHelloActor],"sayHelloActor")


  def main(args: Array[String]): Unit = {
    sayHelloAcorRef1 ! "hello"
  }


}