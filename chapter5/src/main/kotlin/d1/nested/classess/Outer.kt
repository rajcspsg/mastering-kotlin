package d1.nested.classess

class Outer {

  val a = "a"

  val b = "b"

  inner class Nested {
    val c = a
  }

  val nested = this.Nested()
}
