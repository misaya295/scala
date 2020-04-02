package com.cwk.chapter04.forr

object ForUntilDemo02 {


  def main(args: Array[String]): Unit = {
    //输出十句"hello"
    val start = 1
    val end = 11
    for (i <- start until end) {

      println("hello" + i)

    }
  }
}
