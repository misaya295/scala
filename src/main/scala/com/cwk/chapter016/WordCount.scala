package com.cwk.chapter016

object WordCount {

  def main(args: Array[String]): Unit = {
    /**
     * val lines = List("atguigu han hello", "atgiugu han aaa aaa aaa ccc ddd uuu")使用映射集合，
     * list中，各个单词出现的次数，并按照出现次数排序（从大到小）
     */




    //先分步完成，再组合

    //1.步骤

    val lines = List("atguigu han hello", "atgiugu han aaa aaa aaa ccc ddd uuu")



    //val res1 = lines.flatMap((s:String) => s.split(" "))
    val res1 = lines.flatMap(_.split(" "))

    println("res1= " + res1)

    //2.步骤 => 做成一个对偶list=> 才能分组并且统计
//    val res2 = res1.map((s: String) => (s, 1))
    val res2 = res1.map((_, 1))

    println("res2=" + res2)


    //3.步骤3
    //把不同的单词归属到不同的组

//    val res3 = res2.groupBy((xx:(String,Int)) => x._1)
    val res3 = res2.groupBy(_._1)
    println("res3 =" + res3)

    //4.对上面各个元组，进行统计大小
//    val res4 = res3.map((x:(String,List[(String,Int)])) => (x._1,x._2.size))
    val res4 = res3.map(x => (x._1,x._2.size))

    println("res4 =" + res4)


    //5。排序
//    val res5 = res4.toList.sortBy((x:(String,Int))=> x._2)
    val res5 = res4.toList.sortBy(_._2)
    println("res5 = " + res5)




    println("**********************************************")

    //合并
    println(lines.flatMap(_.split(" ").map((_,1)).groupBy(_._1).map(x => (x._1,x._2.size))))




  }




}
