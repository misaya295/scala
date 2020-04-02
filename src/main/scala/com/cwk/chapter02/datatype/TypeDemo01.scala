package com.cwk.chapter02.datatype

object TypeDemo01 {

  def main(args: Array[String]): Unit = {

    var num1: Int = 10
    //因为int 是一个类，因此他的一个实例，就是可以使用很多方法
    //在scala中，如果一个方法。没有形参，则可以省略()
    print(num1.toDouble + "\t" + num1.toString + 100.toDouble)


    var isPass = true

    print(isPass.toString)



  }


  def sayHi():Unit = {
    print("say hi")
  }

}
