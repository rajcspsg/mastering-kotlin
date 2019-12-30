package b2.interfaces

interface Drawable {

  fun draw()

  fun update(currentTime: Long) {
    println("$this drawable update ")
  }
}
