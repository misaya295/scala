package com.cwk.chapter06.oop

object CatDemo {

  val cat = new Cat

  cat.name = "小白"
  cat.age = 10
  cat.color = "白色"



}



class Cat{
//定义/声明三个属性
  //说明
  //1.当我们声明了var name :String时，在底层对应private name
  //2.同时会生成 两个publice方name() <=类似=> getter public name_$eq() => setter
  var name : String = ""
  var age : Int = _
  var color : String = _







}