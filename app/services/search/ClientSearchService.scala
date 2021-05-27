package services.search

import models.Client
import models.dto.Request
import repositories.ClientRepo
import services.validator.ServiceValidator

class ClientSearchService extends Search {

  private val listClient = new ClientRepo().read("client.xls")

  override def getAllPeople(): List[Client] = {
    listClient
      .filter(x => ServiceValidator.ageIsValid(x.age))
      .filter(x => ServiceValidator.emailIsValid(x.email))
      .filter(x => ServiceValidator.telephoneIsValid(x.phone))
  }

  override def searchByAge(min: Int, max: Int): List[Client] = {
    listClient.filter(x => x.age > min && x.age < max)
  }

  def getClient(obj: Request): List[Client] = {
    listClient
      .filter(x => x.age > obj.min_age && x.age < obj.max_age)
      .filter(_.gender == obj.gender)
      .filter(_.numberOfChildren > obj.numberOfChildren)
      .filter(_.firstName.contains(obj.prefixName))
      .filter(_.maritalStatus == obj.maritalStatus)
  }
}
