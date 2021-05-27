package repositories

trait Repository {
  def read(file:String): List[Object]
}
