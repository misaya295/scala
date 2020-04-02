package com.cwk.chapter11

object Exercise {

  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val name2 = names.map(upper)
    println(name2)

  }


  def upper(s: String): String = {

    s.toUpperCase

  }

}
