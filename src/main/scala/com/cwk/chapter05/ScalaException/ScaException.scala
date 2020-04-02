package com.cwk.chapter05.ScalaException

object ScaException {

  def main(args: Array[String]): Unit = {

    try{

      var r = 10 / 0

    }
    catch{

      case ex: ArithmeticException=> {
        println("捕获了除数为0的算数异常")

      }
      case ex: Exception => println("捕获了异常")

    }finally {


      println("scala finally...")
    }



    println("继续执行")


  }

}
