package first.`class`.funs

var greetProvider: () -> String = {"Hello" }

fun main() {
  println(greetProvider())
  greetProvider = {"Hey"}
  println(greetProvider())
}
