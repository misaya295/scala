package com.cwk.chapter15.customercrm.bean

class Customer {


  //属性
  var id: Int = _
  var name: String = _
  var gender: Char = _
  var age: Short = _
  var tel: String = _
  var email:String  = _



  //设计辅助构造器

  def this( name: String, gender: Char, age: Short, tel: String, email:String) {

    this

    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }


  override def toString: String = {


    this.id  + "\t\t" + this.name  + "\t\t" + this.gender + "\t\t" + this.age + "\t\t" + this.tel +  "\t\t" + this.email

  }


}
