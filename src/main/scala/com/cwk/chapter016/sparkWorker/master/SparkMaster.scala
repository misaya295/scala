package com.cwk.chapter016.sparkWorker.master

import akka.actor.{Actor, ActorSystem, Props}
import com.cwk.chapter016.yellowchick.server.YellowChickenServer.{host, port}
import com.typesafe.config.ConfigFactory


class SparkMaster extends Actor{

  override def receive: Receive = {


    case "start" => println("master服务器启动了。。。")

  }
}
object SparkMaster {
  def main(args: Array[String]): Unit = {


    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=127.0.0.1
         |akka.remote.netty.tcp.port=10005
    """
        .stripMargin)


    val sparkMasterSystem = ActorSystem("SparkMaster", config)


    val sparkMasterRef = sparkMasterSystem.actorOf(Props[SparkMaster], "SparkMaster")


    sparkMasterRef ! "start"





  }






}

