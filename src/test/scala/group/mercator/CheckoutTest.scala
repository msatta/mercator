package group.mercator

import org.scalatest.wordspec.AnyWordSpec

class CheckoutTest extends AnyWordSpec {

  "The Checkout system" should {
    "return the right price for a list of Oranges and Apples" in {
      val testSet = List("Apple", "Apple", "Orange", "Apple")
      val expectedResult = 2.05
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }

    "ignore other type of fruit and return the right price only for Oranges and Apple" in {
      val testSet = List("Apple", "Apple", "Orange", "Apple", "Lychee")
      val expectedResult = 2.05
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }

    "return 0 for an empty list" in {
      val testSet = List()
      val expectedResult = 0
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }
  }
}
