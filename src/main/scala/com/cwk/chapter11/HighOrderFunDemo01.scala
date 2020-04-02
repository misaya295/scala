package com.cwk.chapter11

object HighOrderFunDemo01 {

  def main(args: Array[String]): Unit = {


    val res = test(sum2 _, 3.5)
    println("res=" + res)

    val f1 = MyPrint _
    f1()

  }

  def MyPrint(): Unit = {

    println("hello word")
  }

  def test(f : Double => Double, n1: Double) = {


    f(n1)


  }


  def sum2 (d: Double): Double ={


    d + d
  }
}
