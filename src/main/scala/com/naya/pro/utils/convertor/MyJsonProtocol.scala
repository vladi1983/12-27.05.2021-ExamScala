package com.naya.pro.utils.convertor

import com.naya.pro.models.Person
import spray.json._

object MyJsonProtocol extends DefaultJsonProtocol {
  implicit val personFormat: JsonFormat[Person] = jsonFormat7(Person)
}
