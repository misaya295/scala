package com.cwk.chapter08.ScalaInnerClass

import com.cwk.chapter08.ScalaInnerClass

object ScalaInnerClassDemo01 {

  def main(args: Array[String]): Unit = {

    //测试1，创建了两个外部类的实例
    val outer1 : ScalaOuterClass = new ScalaOuterClass();
    val outer2 : ScalaOuterClass = new ScalaOuterClass();

    //在scala中
    //对象，内部类 的方法创建，这里语法可以看出在scala中，默认情况下内部类实例和外部对象关联
    val innner1 = new outer1.ScalaInnerClass
    val innner2 = new outer2.ScalaInnerClass

    innner1.info()

    //创建静态内部类实例
    val ss = new ScalaInnerClass.ScalaOuterClass.ScalaStaticInnerClass



  }


}
//外部类
class ScalaOuterClass {

  myouter =>

  var name = "ss"
  private var sal = 3333.9

  class ScalaInnerClass{
    //成员内部类
    def info() ={

      println("name = " + myouter.name+ "sal = "
      + myouter.sal)


    }
  }

}

object ScalaOuterClass {//伴生对象
class ScalaStaticInnerClass{

  //静态内部类
}
 }
