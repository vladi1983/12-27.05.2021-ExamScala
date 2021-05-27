package services.validator

trait Validator {
  def emailIsValid(str: String): Boolean

  def telephoneIsValid(str: String): Boolean

  def ageIsValid(age: Int): Boolean

}
