package convertor

import scala.io.Source
import java.io.File

import models.{Client, Person}
import org.apache.poi.ss.usermodel.{Sheet, Workbook, WorkbookFactory}
import PersonJsonProtocol._
import spray.json._

object ConvertorImpl extends Convertor {

  override def convertFileXlsToListClient(path: String): List[Client] = {
    val workbook: Workbook = WorkbookFactory.create(new File(path))
    val sheet: Sheet = workbook.getSheetAt(0)
    val buf = scala.collection.mutable.ListBuffer.empty[Client]

    sheet.forEach(x => {
      if (x.getCell(3).toString != "Age") {
        buf.+=(Client(
          x.getCell(0).toString,
          x.getCell(1).toString,
          x.getCell(2).toString,
          x.getCell(3).toString.toDouble.toInt,
          x.getCell(4).toString,
          x.getCell(5).toString,
          x.getCell(6).toString,
          x.getCell(7).toString,
          x.getCell(8).toString.toDouble,
          x.getCell(9).toString,
          x.getCell(10).toString.toDouble.toInt
        ))
      }
    })
    buf.toList
  }

  override def convertFileJsonToListPerson(path: String): List[Person] = {
    val lines: String = Source.fromFile(path).getLines().mkString
    lines.parseJson.convertTo[List[Person]]
    val list: List[Person] = lines.parseJson.convertTo[List[Person]]
    list
  }
}
