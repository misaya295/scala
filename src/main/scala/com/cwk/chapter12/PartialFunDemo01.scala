package com.cwk.chapter12

object PartialFunDemo01 {

  def main(args: Array[String]): Unit = {

    val list  = List(1, 2, 3, "hello")

    println(list.map(addOne2))


  }

  def addOne2(i : Any): Any = {
    i match {
      case x:Int => x + 1
      case _ =>



    }


  }

}
