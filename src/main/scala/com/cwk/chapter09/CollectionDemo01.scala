package com.cwk.chapter09

object CollectionDemo01 {


  def main(args: Array[String]): Unit = {

    val str = "hello"

    for (item <- str)
      {

        println(item)
      }


    println(str(2))
  }





}
