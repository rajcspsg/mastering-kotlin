package c1.abstract.sub.classess

class Square(edgeLen: Double): Rectangle(edgeLen) {

  override fun toString(): String {
    return "Square($width, $height)"
  }

  override fun printArea() = println("Square Area is ${getArea()}")
}
