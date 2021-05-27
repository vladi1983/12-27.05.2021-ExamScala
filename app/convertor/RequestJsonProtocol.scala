package convertor
import models.dto.Request
import spray.json._

object RequestJsonProtocol extends DefaultJsonProtocol {
implicit val numbersFormat = jsonFormat6(Request)
}
