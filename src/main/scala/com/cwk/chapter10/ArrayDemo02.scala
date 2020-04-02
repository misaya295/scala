package com.cwk.chapter10

object ArrayDemo02 {

  def main(args: Array[String]): Unit = {

    var arr02 = Array(1,3,"xx")
    arr02(1) = "xx"
    for (i <- arr02) {
      println(i)
    }

    for (index <- 0 until arr02.length) {


      printf("arr02[%d]=%s", index , arr02(index) + "\t")

    }


  }




}
