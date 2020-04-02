package com.cwk.chapter10

import scala.collection.mutable

object QueueDemo01 {


  def main(args: Array[String]): Unit = {


    val q1 = new mutable.Queue[Int]()

    println(q1)

    q1 += 9
    println("q1=" + q1)
    q1 ++= List(4, 5, 7)
    println("q1=" + q1)

  }
}
