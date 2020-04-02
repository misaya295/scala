package com.cwk.chapter11

object FilterDemo01 {

  def main(args: Array[String]): Unit = {

    val names = List("Alice", "BOb", "Nick")

    val names1 = names.filter(startA)

    println(names1)

  }


  def startA(str: String): Boolean  = {


    str.startsWith("A")
  }
}
