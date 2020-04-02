package com.cwk.chapter11

object ViewDemo01 {


  def main(args: Array[String]): Unit = {


    def multiple(num : Int): Int = {

      num
    }

  }

  def eq(i:Int) : Boolean = {

    i.toString.equals(i.toString.reverse)

  }
  val viewSquares1 = (1 to 100).filter(eq)
  println(viewSquares1)


  //view
  val viewSquares2 = (1  to 100).view.filter(eq)
  println(viewSquares2)

  for (item <- viewSquares2) {

    println("item=" + item)
  }


}
