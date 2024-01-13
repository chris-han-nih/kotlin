package chris.han.dotnut

class Purchase(
  val donuts: List<Donut>,
  val payment: Payment
)

class Payment(
  val creditCard: CreditCard,
  val amount: Int,
) {
  fun combine(payment: Payment): Payment {
    if (creditCard == payment.creditCard) {
      return Payment(creditCard, amount + payment.amount)
    } else {
      throw Exception("Cards don't match")
    }
  }
  
  companion object {
    fun groupByCard(payments: List<Payment>): List<Payment> {
      return payments.groupBy { it.creditCard }
        .values
        .map { it.reduce { a, b -> a.combine(b) } }
    }
  }
}

class CreditCard {
  fun charge(price: Int) {
    println("Charging $price")
  }
}
