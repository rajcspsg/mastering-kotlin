package first.dsl

sealed class Topping(name: String): Item(name)
object Pepperoni: Topping("Pepperoni")
object Olive: Topping("Olive")
object Pipeapple: Topping("Pineapple")

sealed class Pizza(name: String) : Item(name) {
  val toppings = mutableListOf<Topping>()

  operator fun Topping.unaryPlus() = this@Pizza.toppings.add(this)

  override fun log(indent: String) {
    super.log(indent)
    toppings.forEach { println("$indent $name")}
  }

}


class BuildYourOwnPizza(init: Pizza.() -> Unit = {}): Pizza("Build your own pizza") {
  init {
      init.invoke(this)
  }

  override fun toString(): String = this.toString()
}

class PepperoniPizza(init: Pizza.() -> Unit = {}): Pizza("PepperoniPizza") {
  init {
    + Pepperoni
    init.invoke(this)
  }

  override fun toString(): String = "PepperoniPizza"
}
