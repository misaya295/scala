package com.cwk.chapter10

import scala.collection.mutable

object MapDemo01 {

  def main(args: Array[String]): Unit = {

    val map1 = Map("Alice" -> 10, "Bob" -> 20, "kim" -> 30)
    println(map1)



    //可变映射
    val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "kim" -> 30)
    println(map2)

    //创建空映射
    val map3 = new mutable.HashMap[String, Int]()
    println(map3)

    //对偶元组方式创建
    val map4 = mutable.Map(("Alice" , 10) , ("Bob" , 20), ("kim", 30))
    println(map4)

    //方式二，使用contains方法检查是否存在key
    if (map4.contains("Alice")) {

      println(map4("Alice"))

    }else {
      println("key不存在")
    }



    //方式3
    println(map4.get("Alice"))


    //更新map元素
    val map5 = mutable.Map(("A" , 1) , ("B","北京") , ("C" , 3))
    map5("A") = 20
    println("map5=" +map5)

    map5 -= ("A","B")
    println(map5)


    //遍历
    val map6 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))

    println("--------------(k, v) <- map6-------------------")
    for ((k, v) <- map6) println(k + "is mapped to" + v)

    println("--------------v <- map6.key-------------------")
    for (v <- map6.keys) println(v)

    println("--------------v <- map6.values-------------------")
    for (v <- map6.values) println(v)



    //这样取出方式v类型是Tuple2
    println("--------------v <- map6s-------------------")
    for (v <- map6) println(v + " key  =" + v._1 + "val = " + v._2)

  }

}
