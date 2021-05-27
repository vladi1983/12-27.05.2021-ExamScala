package com.naya.pro.services.validator

class ServiceValidator extends Validator {
  val emailRegex =
    """^[a-zA-Z0-9._]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z]{0,61}[a-zA-Z])?)*$""".r
  val telephoneClientRegex = """^[0-9]{3}\-[0-9]{4}\-[0-9]{2}""".r
  val telephonePersonRegex = """^\+[1] \([0-9]{3}\) [0-9]{3}\-[0-9]{4}""".r

  def emailIsValid(str: String): Boolean = str match {
    case null => false
    case str if str.trim.isEmpty => false
    case str if emailRegex.findFirstMatchIn(str).isDefined => true
    case _ => false
  }

  def telephoneIsValid(str: String): Boolean = str match {
    case null => false
    case str if str.trim.isEmpty => false
    case str if telephoneClientRegex.findFirstMatchIn(str).isDefined => true
    case str if telephonePersonRegex.findFirstMatchIn(str).isDefined => true
    case _ => false
  }

  def ageIsValid(age: Int): Boolean = age > 0
}
