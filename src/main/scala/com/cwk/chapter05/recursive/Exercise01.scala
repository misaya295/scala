package com.cwk.chapter05.recursive

object Exercise01 {

  /**
   * 凡波那契
   * @param args
   */

  def main(args: Array[String]): Unit = {
    println(fin(7))
  }

  def fin(n : Int): Int = {

    if (n == 1 || n ==2
    ) {
      1
    }else
      {
        fin(n - 1)+fin(n - 2)
      }


  }




}
