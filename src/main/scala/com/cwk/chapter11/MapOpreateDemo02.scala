package com.cwk.chapter11

object MapOpreateDemo02 {


  def main(args: Array[String]): Unit = {



    val list = List(3,5,6)
    val list2 = list.map(multiple)
    println(list2)

//    val myList =
  }



  def multiple(n: Int) : Int ={


    2 * n
  }

}



class MyList {

  val list1 = List(3, 5, 6, 7)
  var list2 = List[Int]()

  def map(f: Int => Int): List[Int] = {

    for (item <- this.list1) {

      list2 = list2 :+ f(item)
    }

    list2
  }






}


