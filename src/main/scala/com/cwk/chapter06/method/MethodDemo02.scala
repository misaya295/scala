package com.cwk.chapter06.method

object MethodDemo02 {


  def main(args: Array[String]): Unit = {

    val m = new MethodExec
    m.printRect()


  }

}

class MethodExec {

  def printRect(): Unit = {
    for (i <- 0 until 10) {

      for (j <- 0 until 8 ){

        print("*")
      }
      println()
    }


  }




}
