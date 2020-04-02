package com.cwk.chapter06.constructor

import scala.beans.BeanProperty

object BeanPeopertDemo01 {



def main(args: Array[String]): Unit = {

  var c = new Car
  c.setName("d")
  println(c.getName)
}

}


class Car {

 @BeanProperty var name: String = null


}