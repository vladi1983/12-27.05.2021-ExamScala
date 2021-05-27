package controllers

import javax.inject.{Inject, Singleton}
import models.Client
import models.dto.Request
import play.api.libs.json._
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import services.search.ClientSearchService
import spray.json._
import convertor.RequestJsonProtocol._

@Singleton
class ClientController @Inject()(cc: ControllerComponents,
                                 serviceClient: ClientSearchService) extends AbstractController(cc) {
  implicit val jsonClient: OFormat[Client] = Json.format[Client]
  val value: OFormat[Request] = Json.format[Request]

  def getAllClient: Action[AnyContent] = Action {
    val client = serviceClient.getAllPeople()
    Ok(Json.toJson(client))
  }

  def searchByAge(min: Int, max: Int): Action[AnyContent] = Action {
    val searchByAge = serviceClient.searchByAge(min, max)
    Ok(Json.toJson(searchByAge))
  }

  def searchByRequest(json: String): Action[AnyContent] = Action {
    val clients: List[Client] = serviceClient
      .getClient(json.parseJson.convertTo[Request])
    Ok(Json.toJson(clients))
  }
}
