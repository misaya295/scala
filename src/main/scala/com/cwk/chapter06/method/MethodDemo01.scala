package com.cwk.chapter06.method

object MethodDemo01 {


  def main(args: Array[String]): Unit = {

    val dog = new Dog
    println(dog.cal(10,10))


  }


}


class Dog {

  private var sal: Double = _
  var food: String = _


  def cal(n1: Int, n2: Int): Int = {

    return  n1 + n2
  }



}