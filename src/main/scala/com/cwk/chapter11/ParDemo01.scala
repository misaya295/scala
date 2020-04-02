package com.cwk.chapter11
import scala.collection.parallel.CollectionConverters._

object ParDemo01 {

  def main(args: Array[String]): Unit = {
    (1 to 5 ).foreach(println(_))
    println()

    (1  to 5).par.foreach(println(_))
  }



}
