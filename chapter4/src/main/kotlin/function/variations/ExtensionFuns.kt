package function.variations

fun String.isKotlin() = "kotlin".equals(this, true)

fun main() {
  println("rust".isKotlin())
  println("Kotlin".isKotlin())
  println("scala".isKotlin())
}
