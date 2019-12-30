package d1.nested.classess

fun main() {
  class UserManager( ): SettingsProvider by SettingsManager

  class RoboustUserManager(val settingsProvider: SettingsProvider): SettingsProvider by settingsProvider
  
}
