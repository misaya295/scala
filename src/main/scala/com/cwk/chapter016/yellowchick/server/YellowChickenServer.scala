package com.cwk.chapter016.yellowchick.server

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

class YellowChickenServer extends Actor{
  override def receive: Receive = {


    case "start" => println("小黄鸡客服开始工作了")


  }

}
object YellowChickenServer extends App {


  val host = "127.0.0.1"
  val port = 9999

  val config = ConfigFactory.parseString(
    s""" |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$host
       |akka.remote.netty.tcp.port=$port
    """
      .stripMargin)



  val serverActorSystem = ActorSystem("Server")

  val yellowChickenServerRef: ActorRef = serverActorSystem.actorOf(Props[YellowChickenServer], "YellowChickenServer")

  yellowChickenServerRef ! "start"


}