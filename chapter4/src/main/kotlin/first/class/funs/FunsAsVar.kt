package first.`class`.funs

var str: String = "test"

val greetingProvider : () -> String =  { str }


fun main() {
  val greeting = greetingProvider()
  println(greeting)
  str = "123"
  val greeting2 = greetingProvider.invoke()
  println(greeting2)
}
