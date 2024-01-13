package chris.han.dotnut

class Donut(
) {
  companion object {
    const val price = 100
  }
  
  fun buy(
    quantity: Int = 1,
    creditCard: CreditCard,
  ): Purchase {
    return Purchase(
      List(quantity) { Donut() },
      // or
      // List(quantity) { this },
      // or
      // List(quantity) { Donut(price) },
      // or
      // List(quantity) { index -> Donut() },
      Payment(creditCard, price * quantity),
    )
  }
}
