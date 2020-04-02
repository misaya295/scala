package com.cwk.chapter06.constructor

object ConDemo01 {

  def main(args: Array[String]): Unit = {

    var p1 = new Person("d",10)
    println(p1)

  }


}


class Person(inName:String,inAge:Int){

  var name: String = inName
  var age: Int = inAge

  override def toString: String = {

    "name\t" + this.name + "\tage \t" + this.age

  }

}