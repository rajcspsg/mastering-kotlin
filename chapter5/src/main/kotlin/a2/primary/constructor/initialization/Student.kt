package a2.primary.constructor.initialization

class Student(_firstName: String, val lastName: String) {
  val firstName = _firstName
  val id: String
  var nickName = ""

  init {
    id = generateStudentId(firstName, lastName)
  }

  val subjects: MutableList<String> = mutableListOf()

  fun generateStudentId(s1: String, s2: String): String = s1 + "_" + s2 + "_" + Math.random().toLong()

  fun printStudentInfo() {
    println("id $id -> $firstName $lastName")
  }
}
