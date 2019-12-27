import Sample1.DonutStore
import org.scalatest.{FlatSpec, Matchers}

class Tutorial_02_Equality_Test extends FlatSpec with Matchers {
  behavior of "DonutStore class"

  "favourite donut" should "match vanilla donut" in {
    val donutStore = new DonutStore()
    donutStore.favouriteDonut() shouldEqual "vanilla donut"
    donutStore.favouriteDonut() === "vanilla donut"
    donutStore.favouriteDonut() should not equal "plain donut"
    donutStore.favouriteDonut() should not be "plain donut"
    donutStore.favouriteDonut() !== "Plain donut"
  }
}