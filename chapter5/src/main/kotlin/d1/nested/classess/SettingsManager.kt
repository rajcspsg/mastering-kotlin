package d1.nested.classess

object SettingsManager: SettingsProvider {

  private val map = hashMapOf<String, String>()
  override fun getSetting(key: String): String = map.getOrDefault(key, "")
}
