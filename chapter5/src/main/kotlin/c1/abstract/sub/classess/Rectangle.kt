package c1.abstract.sub.classess

open class Rectangle(val width: Double, val height: Double): Shape {

  constructor(width: Double): this(width, width) {

  }

  override fun getArea(): Double {
    return width * height
  }

  override fun toString(): String {
    return "Rectangle($width, $height)"
  }

  open fun printArea() = println("Rectangle Area is ${getArea()}")
}
