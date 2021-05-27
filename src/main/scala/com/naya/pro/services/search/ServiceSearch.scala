package com.naya.pro.services.search

import com.naya.pro.controllers.repositories.ClientRepo
import com.naya.pro.repositories.{ClientRepo, PersonRepo}


class ServiceSearch extends Search {

  val repoClient: ClientRepo
  val repoPerson: PersonRepo

  override def searchByRangeAge(implicit list: List[Object], min: Int, max: Int): List[Object] = {
    repoClient.read()
  }

  override def getAllPeople(req: String): List[Object] = ???

  override def getUser(obj: Object): List[Object] = ???
}
