package a1.custom.accessors

class Course (courseTitle: String) {
  val title = courseTitle
  var description = ""
    set(value) {
      println("description is updated to $value")
      field = value
  }
  get() = field
}
