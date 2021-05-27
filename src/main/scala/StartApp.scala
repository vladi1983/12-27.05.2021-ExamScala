import com.naya.pro.models.Client
import com.naya.pro.repositories.ClientRepo
import com.naya.pro.utils.convertor.ConvertorImpl

object StartApp {
  def main(args: Array[String]): Unit = {

    val value: List[Client] = new ClientRepo().read("client.xls")

  }
}
