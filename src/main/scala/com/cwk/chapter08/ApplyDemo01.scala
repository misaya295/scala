package com.cwk.chapter08

import com.cwk.chapter08.ApplyDemo01.Pig

object ApplyDemo01 {


  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    println(list)

    val pig = new Pig("小花")

    //使用apply方法创建匿名对象
    val pig2 = new Pig("小黑猪")
    val pig3 = pig
    println("pig2.name=" + pig2.name)
    println("pig3.name=" + pig3.name)


  }

class Pig(pName: String){

  var name: String = pName
}


}

object Pig {


  //编写一个apply
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪猪")
}