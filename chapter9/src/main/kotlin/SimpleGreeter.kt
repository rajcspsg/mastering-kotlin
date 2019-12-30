class SimpleGreeter : GreetingProvider {
  override fun getGreeting(): String {
    return "Hi"
  }

  fun getMessage(): String {
    return ""
  }
}
