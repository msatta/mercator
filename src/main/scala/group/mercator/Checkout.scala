package group.mercator

object Checkout {
  def calculateTotalCost(items: List[String]): Double = {
    items.map {
      case "Apple" => 0.6
      case "Orange" => 0.25
      case _ => 0
    }.sum
  }

}
