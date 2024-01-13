package donut

import chris.han.dotnut.CreditCard
import chris.han.dotnut.Donut
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DonutShopKtTest {
  @Test
  fun `testBuyDonuts`(): Unit {
    val creditCard = CreditCard()
    val purchase = Donut().buy(5, creditCard)
    assertEquals(Donut.price * 5, purchase.payment.amount)
    assertEquals(creditCard, purchase.payment.creditCard)
  }
}
