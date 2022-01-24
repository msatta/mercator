package group.mercator

import org.scalatest.wordspec.AnyWordSpec

class CheckoutTest extends AnyWordSpec {

  "The Checkout system" should {
    "return the right price for a list of Oranges and Apples without offers applied" in {
      val testSet = List("Apple", "Orange", "Orange")
      val expectedResult = 1.1
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }

    "ignore other type of fruit and return the right price only for Oranges and Apple" in {
      val testSet = List("Apple", "Orange", "Orange", "Lychee")
      val expectedResult = 1.1
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }

    "return 0 for an empty list" in {
      val testSet = List()
      val expectedResult = 0
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }

    "return the right price when only the orange offer is applied" in {
      val testSet = List("Apple", "Orange", "Orange", "Orange", "Orange", "Orange")
      val expectedResult = 1.6
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }

    "return the right price when only the apple offer is applied" in {
      val testSet = List("Apple", "Orange", "Apple", "Apple"," Apple")
      val expectedResult = 1.45
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }

    "return the right price when both, apple and orange, offers are applied" in {
      val testSet = List("Apple", "Orange", "Orange", "Orange", "Apple", "Apple"," Apple")
      val expectedResult = 1.7
      val actualValue = Checkout.calculateTotalCost(testSet)
      assert(actualValue == expectedResult)
    }
  }
}
