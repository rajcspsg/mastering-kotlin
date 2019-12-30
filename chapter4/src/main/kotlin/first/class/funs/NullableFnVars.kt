package first.`class`.funs

var nullableGreetProvider: (() -> String)? = null

fun main() {
  println(nullableGreetProvider?.invoke())

  nullableGreetProvider.let { println(it?.invoke())}
  nullableGreetProvider = {"Hey"}
}
