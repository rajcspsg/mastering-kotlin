package b2.interfaces

class Player: Movable, Drawable {
  override fun draw() {

  }

  override fun update(currentTime: Long) {
    super<Movable>.update(currentTime)
    super<Drawable>.update(currentTime)
  }

  override fun move(currentTime: Long) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }


}
