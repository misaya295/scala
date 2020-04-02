package com.cwk.chapter016.conn

import akka.actor.{Actor, ActorRef}

class AActor(actorRef: ActorRef) extends  Actor{

  val bActorRef: ActorRef = actorRef

  override def receive: Receive = {




    case "start" => {
      println("AActor 出招了，start ok")
      self ! "我打"
    }

    case  "我打" => {

      println("黄飞鸿")
      Thread.sleep(1000)
      bActorRef ! "我打"

    }

  }
}
