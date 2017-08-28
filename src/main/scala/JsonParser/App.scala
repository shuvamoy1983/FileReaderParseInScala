package JsonParser


import scala.io.Source
import play.api.libs.json._


/**
 * Hello world!
 *
 */
object App {
  def main(args: Array[String]): Unit = {

    var m=""
    var n=""
    var k=""
    for(line <-Source.fromFile("/Users/shuvamoymondal/jsonReader.json").getLines) {
     //println(line)
      m =(m+line).mkString
    }

    n=m.mkString
   // println("\"\"\""+n+"\"\"\"")

    println(Json.parse(m))
  }
}
