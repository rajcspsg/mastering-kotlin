package b2.interfaces

interface Movable: GameObject {
  fun move(currentTime: Long) {
    println("$this movable update")
  }
}
