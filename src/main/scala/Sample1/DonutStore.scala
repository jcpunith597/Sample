package Sample1

class DonutStore {
  def favouriteDonut(): String = "vanilla donut"
  def donuts(): Seq[String] = Seq("vanilla donut", "plain donut", "glazed donut")

  def printName(): Unit = {
    throw new IllegalStateException("Some Error")
  }
}
