package repositories

import convertor.ConvertorImpl
import models.Client

class ClientRepo extends Repository {
  override implicit def read(file: String): List[Client] = {
    ConvertorImpl.convertFileXlsToListClient(s"data/${file}")
  }
}
