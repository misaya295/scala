package com.cwk.chapter05.mylazydd

object LazyDemo01 {


  def main(args: Array[String]): Unit = {


    lazy val res = sum(10, 20)
    println("--------------")
    println("res=" + res)

  }


  def sum(n1: Int, n2: Int):Int = {
    println("sum被执行了")

    return  n1 + n2




  }
}
