package services.search

trait Search {

  def getAllPeople(): List[Object]

  def searchByAge(min: Int, max: Int): List[Object]

 }
