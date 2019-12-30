fun formatGreeting(greetingProvider: GreetingProvider, name: String): String {
  return "${greetingProvider.getGreeting()} $name"
}
