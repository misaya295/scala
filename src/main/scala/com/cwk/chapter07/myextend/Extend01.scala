package com.cwk.chapter07.myextend

object Extend01 {


  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "jack"
    student.studying()
    student.showInfo()
  }
}

class Person {

  var name : String = _
  var age : Int = _
  def showInfo() : Unit = {
    println("学士信息如下：")
    println("名字："+this.name)
  }
}

class Student extends Person {

  def studying() : Unit = {
    println(this.name + "学习scala中")


  }


}