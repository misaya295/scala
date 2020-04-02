package com.cwk.chapter09

object ImplictiDemo02 {
  def main(args: Array[String]): Unit = {

    implicit def addDelete(mySQL: MySQL): DB = {

      new DB
    }

    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete()

  }
}


class MySQL {

  def insert(): Unit = {

    println("insert")
  }

}

class DB {

  def delete() : Unit = {

    println("delete")

  }


}