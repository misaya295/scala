package com.cwk.chapter04.forr

object ForExercise01 {

  def main(args: Array[String]): Unit = {
    /**
     * for循环练习题
     *
     * 打印1～100之间所有是9的倍数的整数个数及总数
     *
     */


    var count = 0
    var sum = 0
    for (i <- 1 to 100 if i % 9 == 0) {
      count += 1
      sum += i

    }

    printf("count=%d,sum=%d\n", count, sum)

  }

}
