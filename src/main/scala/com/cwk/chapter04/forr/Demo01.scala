package com.cwk.chapter04.forr

object Demo01 {


  def main(args: Array[String]): Unit = {
    //输出十句"hello"
    val start = 1
    val end = 10

    //说明
    //1. start 从哪个数开始循环
    //2. to是关键字
    //3. end 循环结束的值
    //4. start to end 表示前后闭合
    for (i <- start to end) {
      println("hello" +i)
    }

    //说明for 这种推导时，也可以直接对集合进行遍历
    var list = List("ds", 321, 31, "tt")
    for (item <- list) {
      println("item=" + item)
    }
  }
}
