package com.naya.pro.controllers

import play.api.libs.json.Json
import play.api.mvc._

import javax.inject.Inject

class Controller @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  implicit val todoFormat = Json.format[Person]

  def getAll = Action {
    val personsToPersons = List[Person]

    Ok(Json.toJson(personsToPersons))
  }
}
