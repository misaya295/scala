package com.cwk.chapter02.iden

object IdenDemo01 {

  def main(args: Array[String]): Unit = {
    //首字符为操作符（比如+ - * /），后续字符也需要操作符，至少一个
    val ++ = "hello,world"
    print(++)


    //看看编译器怎么处理这个问题
    //++ => $plus$plus


    //用反引号`.....`包括任意字符串，即使是关键字（39个）也可以

    var `true` = "hello,scala"
    print("内容=" + `true`)
  }

}
