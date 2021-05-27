package controllers

import javax.inject._
import models.Person
import play.api.libs.json._
import play.api.mvc._
import services.search.PersonSearchService

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok({
      "The server was started successfully!+\n\n" +
        "Checking validation Person: localhost:9000/person\n\n" +
        "Checking validation Client: localhost:9000/client\n\n" +
        "Search PersonByAge: localhost:9000/search/person/{min}/{max}\n\n" +
        "Search ClientByAge: localhost:9000/search/client/{min}/{max}\n\n" +
        "Search ClientByRequest: localhost:9000/search/client"
    })
  }
}
