package convertor

import models.Person
import spray.json._

object PersonJsonProtocol extends DefaultJsonProtocol {
  implicit val personFormat: JsonFormat[Person] = jsonFormat7(Person)
}
