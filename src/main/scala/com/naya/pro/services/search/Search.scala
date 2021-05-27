package com.naya.pro.services.search

trait Search {

  def searchByRangeAge(implicit list: List[Object], min: Int, max: Int): List[Object]

  def getAllPeople(req: String): List[Object]

  def getUser(obj: Object): List[Object]
}
