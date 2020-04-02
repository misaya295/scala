package com.cwk.chapter01.vars

object VarDemo02 {


  def main(args: Array[String]): Unit = {

    //类型推导
    var num = 10

    //方式1，可以利用idea的提示来证明，给出提示
    //方式2，试用isInstanceOf[Int]判断
    print(num.isInstanceOf[Int])

//  类型确定后，就不能修改，说明scala 是强数据类型语言（）
//     num = 1.1错误
//

    //3.在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改变


    var age = 10//可改变
    age = 30
    val  num2 = 30
//    num2 = 40 //不可改变

    //scala设计者为什么设计 var和val
    //（1）在实际编程，我们更多的需求是获取/创建一个对象后，读取该对象的属性，
    //或者是修改对象的属性值，但是我们很少去改变对象本身
    // dog = new Dog() dog.age = 10 dog = new Dog()
    //这时我们就可以使val
    //（2）因为val 没有线程安全问题，因此效率高，scala的设计者推荐我们val
    //（3）如果对象需要改变，则使用var

    val  dog = new Dog
//    dog =new Dog

    dog.age=90 //ok
    dog.name = "小火" //ok

  }
  class Dog{

    //声明一个age属性，给了一个默认值 _
    var age: Int = 0 //

    //声明名字
    var name:String = "" //





  }
}

