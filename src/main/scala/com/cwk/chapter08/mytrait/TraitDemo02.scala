package com.cwk.chapter08.mytrait

object TraitDemo02 {
  def main(args: Array[String]): Unit = {

    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()

  }
}

trait Trait03{

  def sayHi()

  def sayHello(): Unit ={

    println("say hello～")

  }

}

class Sheep extends Trait03 {

  override def sayHi(): Unit = {

    println("小呀hi")

  }
}