package com.cwk.chapter04.mywhile

object WhileDemo01 {

  def main(args: Array[String]): Unit = {
    //输出10句hello
    //1. 定义循环变量
    var i = 0
    //2. i < 10 条件
    while (i < 10) {
      println("hello" + i)
      i += 1
    }
  }

}
