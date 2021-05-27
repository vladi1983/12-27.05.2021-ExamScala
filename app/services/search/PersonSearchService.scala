package services.search

import models.{Person}
import repositories.PersonRepo
import services.validator.ServiceValidator

class PersonSearchService extends Search {
  private val listPersonNotCorrect = new PersonRepo().read("person_not_correct_test.json")
  private val listPersons = new PersonRepo().read("persons.json")

  override def getAllPeople(): List[Person] = {
    listPersonNotCorrect
      .filter(x => ServiceValidator.ageIsValid(x.age))
      .filter(x => ServiceValidator.emailIsValid(x.email))
      .filter(x => ServiceValidator.telephoneIsValid(x.phone))
  }

  override def searchByAge(min: Int, max: Int): List[Person] = {
    listPersons.filter(x => x.age > min && x.age < max)
  }
}


