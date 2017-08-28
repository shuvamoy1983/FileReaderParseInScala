package JsonParser

import scala.io.Source
import scala.io.Source
import play.api.libs.json._

/**
  * Created by shuvamoymondal on 8/27/17.
  */
class FileJsonReader(message: String)
{
  def SayFileName() = println("File name: " + message)

  def JsonReadAndParse()= {

    var m=""
    var n=""
    for(line <-Source.fromFile(message).getLines) {
      m =(m+line).mkString
    }
    println(Json.parse(m))
  }

}
