/**
  * Created by shuvamoymondal on 8/27/17.
  */

import JsonParser.FileJsonReader;

object MainExe {
  def main(args: Array[String]): Unit = {
   val gr
    =new FileJsonReader("/Users/shuvamoymondal/jsonReader.json")

    gr.SayFileName()
    gr.JsonReadAndParse()
  }
}
