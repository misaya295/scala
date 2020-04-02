package com.cwk.chapter15.customercrm.service

import com.cwk.chapter15.customercrm.bean.Customer

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import util.control.Breaks._

class CustomerService {




  var cunstomerNum  = 1
  val customers = ArrayBuffer(new Customer("tom", '男', 10, "110", "kk@qq.com"))


  def list(): ArrayBuffer[Customer] = {

    this.customers
  }

  //添加用户
  def add(customer: Customer):Boolean = {
    //设置id
    cunstomerNum += 1
    customer.id = cunstomerNum
    //加入到customer
    customers.append(customer)
    true

  }

  def del(id: Int): Boolean = {

    val index = findIndexByID(id)
    if (index != -1) {

      customers.remove(id)
      true
    } else
      {
        false
      }


  }



  def findIndexByID(id: Int): Unit = {

    var index = -1

    breakable {

      for (i <- 0 until customers.length) {

        if (customers(i).id == id) {


          index =  i
          break()

        }
      }
      index
    }
  }
}
