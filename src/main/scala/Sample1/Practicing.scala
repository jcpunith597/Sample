package Sample1

import scala.collection.immutable.ListMap


object Practicing {

  def main(args: Array[String]): Unit = {

    val listMap1: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "SD" ->"Strawberry Donut", "CD" -> "Chocolate Donut")
    println(s"Elements of listMap1 = $listMap1")
    //listMap1 += ("AD"-> "Akki Donut")
    println(s"Elements of listMap1 = $listMap1")
    //listMap1 += ("RD"-> "Raagi Donut")
    println("Elements of listMap1 = "+listMap1("PD"))

  }





}

