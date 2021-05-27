package convertor

import models.{Client, Person}

trait Convertor {
  def convertFileXlsToListClient(path: String): List[Client]

  def convertFileJsonToListPerson(path: String): List[Person]
}
