package com.cwk.chapter09

object ImplictiValueDemo01$ {


  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jack" //这个就是隐式值



    def hello(implicit  name: String): Unit = {
      println(name + " hello")
    }


    hello
  }

}
