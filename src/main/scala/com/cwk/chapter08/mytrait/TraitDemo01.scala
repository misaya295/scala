package com.cwk.chapter08.mytrait

object TraitDemo01 {

  def main(args: Array[String]): Unit = {
    val c = new C()
    val f = new F()
    c.getConnect()
    f.getConnect()



  }

}


trait Trait01
{

  //定义一个规范
  def getConnect()
}

class A{}
class B extends A{}
class C extends A with Trait01 {

  override def getConnect(): Unit = {
    println("连接mysql")

  }

}

class D{}
class E extends D{}
class F extends D with Trait01 {

  override def getConnect(): Unit = {
    println("连接orecal")
  }
}
