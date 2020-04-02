package com.cwk.chapter14

object RecursiveReverseString {

  def main(args: Array[String]): Unit = {
    val str = "hello"
    println(reverse(str))
  }
  

  def reverse(xs: String): String =

    if (xs.length == 1)
      xs
    else

      reverse(xs.tail) + xs.head
}
