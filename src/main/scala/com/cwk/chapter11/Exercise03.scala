package com.cwk.chapter11

import scala.collection.mutable


object Exercise03 {

  def main(args: Array[String]): Unit = {


    //1
    val sentence = "AAAAAAAAAAABBBBBBBBCCCCCCCCCDDDDDD"
    val map2 = sentence.foldLeft(Map[Char, Int]())(charCount)
    println("map2" + map2)

//    val map3 = mutable.Map[Char, Int]()


  }

  def charCount(map: Map[Char, Int],char : Char): Map[Char,Int] = {

    map + (char -> (map.getOrElse(char,0) + 1))

  }

//
//  def charCount2(map:mutable.Map[Char,Int],char: Char): mutable.Map[Char,Int] = {
//
////    map += (Char -> (map.getOrElse(char,0) + 1))
//  }






}
