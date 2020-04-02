package com.cwk.chapter11

import scala.collection.mutable.ArrayBuffer

object Exercise02 {

  def main(args: Array[String]): Unit = {


    val sentence = "AHBFHAVSHVHAFJSKBFJHABSFHAB"
    val arrayBuffer = new ArrayBuffer[Char]()
    sentence.foldLeft(arrayBuffer)(putArray)
    println("arrayBuffer=" + arrayBuffer)
  }


  def putArray(arr: ArrayBuffer[Char],c: Char): ArrayBuffer[Char] = {

    arr.append(c)
    arr

  }

}
