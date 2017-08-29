package JsonParser

import scala.io.Source
import scala.io.Source
import play.api.libs.json._
import net.liftweb.json._

/**
  * Created by shuvamoymondal on 8/27/17.
  */
class FileJsonReader(message: String)
{
  case class Model(Name: String, Author: String, Company: String)
  def SayFileName() = println("File name: " + message)

  def JsonReadAndParse()= {

    var m=""
    var n=""
    for(line <-Source.fromFile(message).getLines) {
      m =(m+line).mkString
    }
    val rslt=Json.parse(m)
    println(rslt)
   // implicit val modelFormat = Json.format[Model]
    //val ss=Json.fromJson[Model] (rslt)
    // println(ss)


    val kk= Model(rslt.\\("Name").mkString,rslt.\\("Author").mkString,rslt.\\("Company List").mkString)
    println(kk.toString)

  }

}

