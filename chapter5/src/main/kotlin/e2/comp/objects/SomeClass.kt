package e2.comp.objects

class SomeClass private constructor(){
  private val id = "id"

  companion object Factory : SomeInterface {
    const val someVal = "val"

    fun foo() {}

    override fun doSomeThing() {
      super.doSomeThing()
    }

    fun createSomeClass() = SomeClass()
  }
}
