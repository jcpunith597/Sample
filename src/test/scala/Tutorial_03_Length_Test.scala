import Sample1.DonutStore
import org.scalatest.{FlatSpec, Matchers}

class Tutorial_03_Length_Test extends FlatSpec with Matchers {

  "Method DonutStore.printName()" should "throw IllegalStateException" in {
    val donutStore = new DonutStore()
    val exception = the [java.lang.IllegalStateException] thrownBy {
      donutStore.printName()
    }
    // here we verify that the exception class and the internal message
    exception.getClass shouldEqual classOf[java.lang.IllegalStateException]
    exception.getMessage shouldEqual  ("Some Eggggggrror")
    }
}
