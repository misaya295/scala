package com.cwk.chapter05.fun

object FunDemo01 {

  def main(args: Array[String]): Unit = {

    val n1 = 10
    val n2 = 20
    println(getRes(1,2,'-'))


  }

  //定义函数/方式
  def getRes(n1:Int,n2:Int,opean:Char) = {

    if (opean == '+')
    {
      n1 + n2
    } else if (opean == '-') {
      n1 - n2
    } else {
        null
    }


  }


}
