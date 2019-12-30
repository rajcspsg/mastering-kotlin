fun main(args: Array<String>) {
  var languages = listOf("kotlin", "java", "rust")
  println(languages.isNotEmpty())

  var companies: List<String>? = null
  println(companies?.isNotEmpty())

  // var subjects = listOf<String>("CS", "Math", "Physics")
  //val student: Student
  companies= listOf()
  println(companies?.get(0)?.toLowerCase())
}
