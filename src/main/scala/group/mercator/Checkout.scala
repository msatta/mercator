package group.mercator

object Checkout {
  def appleOffer(number:Int): Int = (number / 2) + (number % 2)
  def orangeOffer(number:Int): Int = number - number/3

  def calculateTotalCost(items: List[String]): Double = {
    items.groupBy(identity).map {
      case ("Orange", elements) => orangeOffer(elements.size) * 0.25
      case ("Apple", elements) => appleOffer(elements.size) * 0.6
      case _ => 0
    }.sum
  }

}
