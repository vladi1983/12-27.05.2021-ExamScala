package com.naya.pro.repositories

import com.naya.pro.models.Client
import com.naya.pro.utils.convertor.ConvertorImpl

class ClientRepo extends Repository {
  override implicit def read(file: String): List[Client] = {
    ConvertorImpl.convertFileXlsToListPerson(s"data/${file}")
  }
}
