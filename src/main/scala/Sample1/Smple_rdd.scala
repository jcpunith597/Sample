package Sample1

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object Smple_rdd {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setAppName("aprk_example").setMaster("local[*]")

    val spark = SparkSession
      .builder()
      .config(sparkConf)
      .getOrCreate()

    val sc = spark.sparkContext
    val textRDD1 = sc.textFile("D:\\sample_project_learning\\Sample2\\input\\input.txt")
    val header = textRDD1.first()
     val  data = textRDD1.filter(row => row != header).map(_.split(",")).map{ x =>((x(2)),(x(1),x(3).toDouble))}.groupByKey
    //val d1=   data.map{ x =>((x(2)),(x(1),x(3).toDouble))}.groupByKey
    //data.collect().foreach(e => println(e._1+"===="+e._2))
    for(i<-data)
    {
     println(i._1,i._2.filter(x=>x._2==i._2.map(x=>x._2).max).mkString)
     }




  }


  def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calculating the price for $quantity $donutType")
    val totalCost = 2.0 * quantity * (1 - discount)
    totalCost
  }
}
