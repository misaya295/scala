package com.cwk.chapter08

object AccompanyObject {


  def main(args: Array[String]): Unit = {


    println(ScalaPerson.sex)
  }

}
//说明
//1.当在同一个文件中，有class ScalaPerson 和 object ScalaPerson
//2.class ScalaPerson 称为伴生类，将非静态的内容写到该类中
//3.object ScalaPerson 称为伴生对象，将静态内容写入到该对象（类）
//4.class ScalaPerson 编译后底层生成  ScalaPerson类 和 ScalaPerson.class
//5.object ScalaPerson 编译后底层生成ScalaPerson$类 和ScalaPersona$.class



//伴生类
class ScalaPerson{

  var name : String = _


}
//伴生对象
object ScalaPerson {


  var sex : Boolean = true
}
