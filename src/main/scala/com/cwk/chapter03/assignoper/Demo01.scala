package com.cwk.chapter03.assignoper

object Demo01 {


  def main(args: Array[String]): Unit = {
    var num  = 2
    num <<= 2
    println("num=" + num)


    var  a = 10
    var  b  = 20

    a = a + b
    b = a - b  //(a+b)-b = a
    a=  a - b  //(a+b)-a = b


    //位运算

   //在scala中支持代码块，返回值
    val res = {

      if (num > 1 ) "hello.ok" else 100


    }
    println("res=" + res)
  }



}
