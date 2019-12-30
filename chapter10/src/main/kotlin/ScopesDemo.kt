import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
  GlobalScope.launch {
    delay(500)
    println("courintes")
  }
  println("Hello")
  Thread.sleep(1000)
}
