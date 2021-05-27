package com.naya.pro.repositories

import com.naya.pro.models.Person
import com.naya.pro.utils.convertor.ConvertorImpl

class PersonRepo extends Repository {
  override implicit def read(file: String): List[Person] = {
    ConvertorImpl.convertFileJsonToListPerson(s"data/${file}")
  }
}
