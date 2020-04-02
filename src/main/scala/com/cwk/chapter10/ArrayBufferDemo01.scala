package com.cwk.chapter10

import scala.collection.mutable.ArrayBuffer


object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {


    //创建ArrayBuffer
    val arr01 = ArrayBuffer[Any](3, 2, 5)


    //通过下标访问元素
    println("arr01(1)=" + arr01(1))

    //遍历
    for (i <- arr01) {
      println(i)
    }

    println(arr01.length)


    println("arr01.hash=" + arr01.hashCode())

    //使用appen追加数据，支持可变参数
    //可以理解成java数组的扩容
    arr01.append(90.0,13)
    println("arr01.hash=" + arr01.hashCode())


    println("===================")

    arr01(1) = 89 //修改

    println("----------------------")
    for (i <- arr01) {
      println(i)
    }

    //删除。是根据下标
    arr01.remove(0)

    println("----------删除后的元素遍历------------")
    for (i <- arr01) {
      println(i)
    }
    
    println("最新的长度=" + arr01.length)


  }




}
