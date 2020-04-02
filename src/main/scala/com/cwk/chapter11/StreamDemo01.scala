package com.cwk.chapter11

object StreamDemo01 {


  def main(args: Array[String]): Unit = {
    def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)
    val stram1 = numsForm(1)
    println(stram1)
    println("head=" + stram1.head)
    println(stram1.tail)
    println(stram1)
  }


}
