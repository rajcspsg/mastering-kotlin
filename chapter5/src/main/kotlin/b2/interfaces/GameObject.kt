package b2.interfaces

interface GameObject {
  val id: String
  get() = "defaultId"
  fun update(currentTime: Long) {
    println("$this ")
  }
}
