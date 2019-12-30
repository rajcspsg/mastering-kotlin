package first.dsl

import java.util.*

fun order(init: Order.() -> Unit): Order  {
  val order = Order(UUID.randomUUID().toString())
  order.init()
  return order
}




data class Order (val id: String) : Item("Order") {
  val items = mutableMapOf<Item, Int>()

  override fun toString(): String {
    return "Order(id = $id, items = $items) "
  }

  fun soda(soda: Soda) : Int? = items.put(soda, items.getOrDefault(soda, 0) + 1)

  operator fun Soda.unaryPlus() = this@Order.soda(this)

  infix fun Soda.quantity(quantity: Int) {
    this@Order.items[this] = this@Order.items.getOrDefault(this, 0) + quantity
  }

  fun pizza(init: Pizza.() -> Unit ) {
    val pizza = BuildYourOwnPizza()
    pizza.init()
    items[pizza] = 1
  }

  operator fun Pizza.unaryPlus() = this@Order.items.getOrDefault(this, 0) + 1

  override fun log(indent: String) {
    println("Order: $id")
    println("Items")
    items.forEach { print("${it.value} x"); it.key.log(" ")}
  }
}
