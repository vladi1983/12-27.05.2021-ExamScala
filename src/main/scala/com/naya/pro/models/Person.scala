package com.naya.pro.models

case class Person(
                   age: Int,
                   name: String,
                   gender: String,
                   company: String,
                   email: String,
                   phone: String,
                   address: String
                 )
  extends Serializable
