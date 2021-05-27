package repositories

import convertor.ConvertorImpl
import models.Person

class PersonRepo extends Repository {
  override def read(file: String): List[Person] = {
    ConvertorImpl.convertFileJsonToListPerson(s"data/${file}")
  }
}
