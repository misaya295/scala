package com.cwk.chapter11

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 20, 30, 4, 5)

    val res  = list.reduceLeft(sum)
    println(res)


  }



  def sum(n1: Int, n2: Int): Int = {

    println("调用")

    n1 + n2
  }

}
