package first.dsl

sealed class Soda(name: String): Item(name)
object Coke: Soda("Coke") {
  override fun toString(): String {
    return "Coke"
  }
}
object Sprite: Soda("Sprite") {
  override fun toString(): String {
    return "Sprite"
  }
}
object DrPepper: Soda("DrPepper") {
  override fun toString(): String = "DrPepper"
}
