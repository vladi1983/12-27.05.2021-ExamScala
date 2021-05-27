package models

case class Client(
                   firstName: String,
                   lastName: String,
                   gender: String,
                   age: Int,
                   email: String,
                   phone: String,
                   education: String,
                   occupation: String,
                   salary: Double,
                   maritalStatus: String,
                   numberOfChildren: Int
                 )

