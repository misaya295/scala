package com.cwk.chapter07.homework

object Exercise01 {
  def main(args: Array[String]): Unit = {
    val cur = new Time(10, 10)
    var other = new Time(10,20)
    println(cur.before(other))

  }

}


class Time(hrs: Int,min: Int)
{
  val hours: Int = hrs
  val minutes: Int = min

  def before(other: Time): Boolean={

    if(hours < other.hours) {
      true
    }
    else if (hours > other.hours) {
      false
    }else {

      if (minutes < other.minutes) true else false
    }


  }



}