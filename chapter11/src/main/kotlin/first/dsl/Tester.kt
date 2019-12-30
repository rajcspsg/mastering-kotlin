package first.dsl

fun main()  {
  val order = order {
    println(this.id)
  }

  println(order)

  val order2 = order {
    this.items[Coke] = this.items.getOrDefault(Coke, 0) + 1
  }

  println(order2)


  val order3 = order {
    soda(Coke)
    + Sprite
    Coke quantity 3
    pizza {
      +Pipeapple
    }
  }

  //println(order3)
  order3.log()
}
