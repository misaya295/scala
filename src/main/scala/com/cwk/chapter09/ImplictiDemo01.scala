package com.cwk.chapter09

object ImplictiDemo01 {


  def main(args: Array[String]): Unit = {

    //编写一个隐试转换程序
    implicit  def f1(d: Double): Int = {


      d.toInt
    }
    val num : Int = 3.5
    val num2 : Int = 6.7

    println("num = "+ num)



    }
}

