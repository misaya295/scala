package com.cwk.chapter016.conn

import akka.actor.Actor

class BActor extends Actor{
  override def receive: Receive = {



    case "我打" => {
      Thread.sleep(1000)

        println("BActor")
        sender() ! "我打"
    }



  }



}
