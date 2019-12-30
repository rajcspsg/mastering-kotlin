import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
  launch {
      delay(500)
    println("Coroutines")
  }

  println("Hello")
}
