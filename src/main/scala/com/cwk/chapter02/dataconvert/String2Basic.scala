package com.cwk.chapter02.dataconvert

object String2Basic {
  def main(args: Array[String]): Unit = {
    //在将String类型转成基本数据类型时，要确保String类型能够转成有效的数据，比如
    //我们可以把"123"，转成一个整数，但是不能把"hello"转成一个整数
    //val s3 = "hello"
    // println(s3.toInt)

    //思考就是要把"12.5"，转成Int
    //在scala中，不是将小数点后的数据进行截取，而是会抛出异常
    val s4 = "12.5"
    print(s4.toInt)//
  }
}
