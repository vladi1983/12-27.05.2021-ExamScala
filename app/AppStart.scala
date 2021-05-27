
import models.dto.Request
import services.search.{ClientSearchService, PersonSearchService}

object AppStart {
  def main(args: Array[String]): Unit = {
    println("If you want to start the server")
    println("You will use Play2App(Template of Intellij Ultimate) ")

    val clientService = new ClientSearchService()
    println("*********************************** Get All Client With Validation (Client.xls) ************************************************************************")
    clientService.getAllPeople().foreach(println(_))
    println("****************************************** Search By Age (Client.xls) ********************************************************************************")
    clientService.searchByAge(25, 30).foreach(println(_))
    println("***************************************** Search By Request (Client.xls) ******************************************************************************")
    clientService.getClient(Request(20, 30, "Male", "A", "Married", 2)).foreach(println(_))

    val personService = new PersonSearchService()
    println("************************ Get All Person With Validation (list_person_not_correct.json) ****************************************************************")
    personService.getAllPeople().foreach(println(_))
    println("**************************************** SearchByAge (person.json) ********************************************************************************")
    personService.searchByAge(25, 30).foreach(println(_))
  }
}
