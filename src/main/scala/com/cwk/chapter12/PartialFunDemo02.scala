package com.cwk.chapter12

object PartialFunDemo02 {

  def main(args: Array[String]): Unit = {

    val list  = List(1, 2, 3, "hello")


    val p =new PartialFunction[Any,Int] {


      override def isDefinedAt(x: Any) = x.isInstanceOf[Int]

      override def apply(v1: Any) = {

        v1.asInstanceOf[Int] + 1

      }
    }

    val list2 = list.collect(p)

    println(list2)


  }


}
