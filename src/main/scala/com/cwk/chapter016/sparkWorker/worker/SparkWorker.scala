package com.cwk.chapter016.sparkWorker.worker

import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

class SparkWorker(masterHost: String,masterPort: Int) extends Actor{


  var masterPorxy: ActorSelection = _

  override def preStart():Unit = {

    println("prestaert()调用")
    masterPorxy = context.actorSelection(s"akka.tcp://SparkMaster@${masterHost}:${masterPort}/user/SparkMaster-01")

    println("masterProxy=" + masterPorxy)




  }


  override def receive: Receive = {



    case "start" => {


      println("worker启动了")


    }


  }



}

object SparkWorker {

  def main(args: Array[String]): Unit = {


    val workerHost = "127.0.0.1"
    val workerPost = 10001
    val masterHost = "127.0.0.1"
    val masterPort = 10005


    val config = ConfigFactory.parseString(
      s""" |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=127.0.0.1
         |akka.remote.netty.tcp.port=10002
    """
        .stripMargin)


    val sparkWorkerSystem = ActorSystem("SparkMaster-01", config)


    val actorRef = sparkWorkerSystem.actorOf(Props(new SparkWorker(masterHost, masterPort)), "SparkMaster-01")


    actorRef ! "start"


  }


}
