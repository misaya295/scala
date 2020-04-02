package com.cwk.chapter09

object ImplictClassDemo01 {


  def main(args: Array[String]): Unit = {

      implicit class DB1(val m: MySQL1) {

        def  addSuffix(): String = {


          m + "scala"
        }

      }



    val mySQL1 = new MySQL1
    mySQL1.sayOk()
    mySQL1.addSuffix()
  }



}

class MySQL1 {

  def sayOk(): Unit = {


    println("sayok")

  }

}
