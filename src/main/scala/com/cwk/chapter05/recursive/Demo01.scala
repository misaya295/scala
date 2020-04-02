package com.cwk.chapter05.recursive

object Demo01 {

  def main(args: Array[String]): Unit = {

    test(5)

  }


  def test (n: Int): Unit = {

    if (n > 2) {
      test(n - 1)
    }

    println("n=" + n)

  }
}
