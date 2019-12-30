package function.variations

class Person(val firstName: String, val lastName: String) {

  private val interests: MutableList<String> = mutableListOf()

  fun printName() {
    println("$firstName $lastName")
  }

  infix fun addInterest(interest: String) = interests.add(interest)
}

fun main() {
  val p = Person("raj", "kumar")
  println(p.printName())

  p addInterest "rust"
  p addInterest "scala"
}
