package com.cwk.chapter04.ifes

import scala.io.StdIn

object Demo01 {


  def main(args: Array[String]): Unit = {

    printf("输入年龄")

    val age = StdIn.readInt()

    if (age > 18) {
      printf("age > 18")
    }


  }
}
