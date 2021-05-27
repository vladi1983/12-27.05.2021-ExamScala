package controllers

import javax.inject.{Inject, Singleton}
import models.Person
import play.api.libs.json.{Json, OFormat}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import services.search.PersonSearchService

@Singleton
class PersonController @Inject()(val cc: ControllerComponents,
                                 servicePerson: PersonSearchService) extends AbstractController(cc) {

  implicit val jsonPerson: OFormat[Person] = Json.format[Person]

  def getAllPerson: Action[AnyContent] = Action {
    val persons = servicePerson.getAllPeople()
    Ok(Json.toJson(persons))
  }

  def searchByAge(min: Int, max: Int): Action[AnyContent] = Action {
    val searchByAge = servicePerson.searchByAge(min, max)
    Ok(Json.toJson(searchByAge))
  }
}
