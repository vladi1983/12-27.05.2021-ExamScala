package com.naya.pro.repositories

trait Repository {
  def read(file:String): List[Object]
}
