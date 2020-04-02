package com.cwk.chapter01.vars

object VarDemo01 {

  def main(args: Array[String]): Unit = {
    var age: Int = 10
    var sal: Double = 10.9
    var name:String = "tom"
    var isPass:Boolean = true
    //在scala中，小数默认为Double，整数默认为Int
    var score:Float = 70.9f
    print(s"${age} ${isPass}" )


  }

}
