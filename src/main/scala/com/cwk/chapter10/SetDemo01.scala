package com.cwk.chapter10

import scala.collection.mutable

object SetDemo01 {

  def main(args: Array[String]): Unit = {


    val set = Set(1,2,3)//不可变
    println(set)

    val set2 = mutable.Set(1,2,"h") //可变
    println("set2" + set2)

  }

}
