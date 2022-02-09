// object CSVDemo extends App {
//     // println("Month, Income, Expenses, Profit")
//     val bufferedSource = io.Source.fromFile("../sample.csv")
//     for (line <- bufferedSource.getLines) {
//         val cols = line.split(",").map(_.trim)
//         // do whatever you want with the columns here
//         println(s"${cols(0)},${cols(1)}}")
//     }
//     bufferedSource.close
// }
import org.*
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}
object ReadCSVFile {
  println("Hello")
  case class Subject(oops:Int, ds:Int)
  def main(args : Array[String]): Unit = {
    var conf = new SparkConf().setAppName("Read CSV File").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._
    val textRDD = sc.textFile("../sample.csv")
    //println(textRDD.foreach(println)
    val empRdd = textRDD.map {
      line =>
        val col = line.split(",")
        Subject(col(0), col(1))
    }
    val empDF = empRdd.toDF()
    empDF.show()
    /* Spark 2.0 or up
      val empDF= sqlContext.read.format("csv")
  .option("header", "true")
  .option("inferSchema", "true")
  .load("src\\main\\resources\\emp_data.csv")
     */
  }
}