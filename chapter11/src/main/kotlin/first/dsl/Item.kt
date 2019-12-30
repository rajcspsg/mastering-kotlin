package first.dsl

@ItemTagMarker
abstract class Item(val name: String) {
 open fun log(indent: String = "") {
   println("$indent $name")
 }
}
