package com.cwk.chapter03.inputcon

import scala.io.StdIn

object Demo01 {

  def main(args: Array[String]): Unit = {

    /**
     * 要求：可以从控制台接收用户信息，【姓名，年龄，薪水】
     *
     */

    println("请输入姓名")
    val name  = StdIn.readLine()


    println("请输入年龄")
    val age  = StdIn.readInt()




    println("请输入薪水")
    val sal  = StdIn.readDouble()

    printf("用户的信息为 name=%s age=%d sal=%f", name, age, sal)

    Cat.sayhi()
    Cat.saya()


  }
object  Cat extends  AAA {



  def sayhi() : Unit = {


    println("小狗汪汪叫")
  }

}
  trait AAA {

    def saya() : Unit = {

      println("aaaa")

    }
  }
}
