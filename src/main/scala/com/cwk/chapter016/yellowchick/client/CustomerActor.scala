package com.cwk.chapter016.yellowchick.client

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

class CustomerActor(serverHost: String, serverPort: Int) extends Actor{

  //定义一个 YellowChickenServerRef
  var serverActorRef: ActorSelection = _


  override def preStart(): Unit = {

    println("preStart() 执行")
    serverActorRef = context.actorSelection(s"akka.tcp://Server@${serverHost}:${serverPort}/user/YellowChickenServer")

  }

  override def receive: Receive = {

    case "start" => println("start，客户端运行，可以咨询问题")


  }
}

object CustomerActor extends App {


  val (clientHost, clientPort, serverHost, serverPort) = ("127.0.0.1", 9990, "127.0.0.1", 9999)

  val config = ConfigFactory.parseString(
    s"""
       |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$clientHost
       |akka.remote.netty.tcp.port=$clientPort
    """.stripMargin


    )


  val clientActorSystem = ActorSystem("client")


  val customerActorRef: ActorRef = clientActorSystem.actorOf(Props(new CustomerActor(serverHost, serverPort)), "CustomerActor")

  customerActorRef ! "start"

}





