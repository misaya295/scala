package com.cwk.chapter05.ScalaException

object ThrowDemo {


  def main(args: Array[String]): Unit = {

//    val res = test()
//    println(res.toString)

    try {
      test()
    }catch {
      case ex: Exception => println("捕获到异常" + ex.getMessage)
    }finally {

    }

    println("ok")
  }

  def test(): Nothing = {


    throw  new Exception("异常NO1出现～")


  }

}
