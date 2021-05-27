package com.naya.pro.utils.convertor

import com.naya.pro.controllers.models.Client
import com.naya.pro.models.{Client, Person}

trait Convertor {

  def convertFileXlsToListPerson(path: String): List[Client]

  def convertFileJsonToListPerson(path: String): List[Person]

}
