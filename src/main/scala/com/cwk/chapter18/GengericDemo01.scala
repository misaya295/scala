package com.cwk.chapter18

object GengericDemo01 {


  def main(args: Array[String]): Unit = {
    val intMessage = new IntMessage[Int](10)

    println(intMessage)

  }


}


abstract class  Message[T](s:T){

  def get = s

}
class IntMessage[Int](v:Int) extends Message