package com.cwk.chapter08.extendTraitDemo01

object Demo01 {



}

trait  LoggedExceptionn extends Exception {

  def log(): Unit = {

    println(getMessage)





  }

}

class UnhappyEx extends LoggedExceptionn {

  override def getMessage: String = "错误细心"
}