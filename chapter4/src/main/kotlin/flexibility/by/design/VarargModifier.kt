package flexibility.by.design

fun helloFunctions(greeting: String, vararg names: String) {
  names.forEach { println("$greeting $it") }
}

fun main() {
  helloFunctions("hola", "kotlin", "scala", "haskell", "idris", "rust")
}
