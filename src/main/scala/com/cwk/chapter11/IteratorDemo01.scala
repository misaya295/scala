package com.cwk.chapter11

object IteratorDemo01 {


  def main(args: Array[String]): Unit = {

    val iterator = List(1, 2, 3, 4, 5).iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }
}
