package com.naya.pro.models.dto

case class Request(
                    min_age: Int,
                    max_age: Int,
                    gender: String,
                    prefixName: String,
                    maritalStatus: String,
                    numberOfChildren: Int
                  )
