name := "Sample2"

version := "0.1"

scalaVersion := "2.11.1"

val sparkVersion = "2.4.4"

libraryDependencies ++= Seq( 
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % "2.4.4",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
  
)