import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
  println("show loading")
  launch {
    println("loaded data is ${loadData()}")
  }

  println("called loaded data")
}

suspend fun loadData(): Int {
  return loadFromSource1() + loadFromSource2()
}

suspend fun loadFromSource1(): Int {
  delay(1000)
  return 3
}
suspend fun loadFromSource2(): Int {
  delay(2500)
  return 5
}
