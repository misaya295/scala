package com.cwk.chapter08.mixin

object MixinDemo0 {

  def main(args: Array[String]): Unit = {

    val oracleDB = new oracleDB with Operate3
    oracleDB.insert(100)

    val mysql3 = new Mysql3 with  Operate3

    val mysql3_ = new Mysql3_ with  Operate3 {
      override def say(): Unit =
    {
      println("say")


    }
    }

    mysql3_.insert(1111)
    mysql3_.say()

  }

}

trait Operate3 {

  def insert(id: Int):Unit = {

    println("插入数据 = " + id)



  }

}
class oracleDB{}
abstract class Mysql3{}
abstract class Mysql3_{



  def say()
}
