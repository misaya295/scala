package com.cwk.chapter05.functiondetails

object VarParameters {


  def main(args: Array[String]): Unit = {
    //编写一个函数sum，可以求出 1到多个int的和
    println(sum(1,2,3,4,5))
  }


  def sum(n1 : Int, args: Int*): Int = {
    println("args.length" + args.length)

    //遍历
    var sum = 0
    for (item <- args) {
      sum += item
    }

    sum


  }
}
