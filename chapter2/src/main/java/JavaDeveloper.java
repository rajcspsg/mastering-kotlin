public class JavaDeveloper {
  private String name;
  private String favoriteLanguage;

  public JavaDeveloper(String name, String favoriteLanguage) {
    this.name = name;
    this.favoriteLanguage = favoriteLanguage;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFavoriteLanguage() {
    return favoriteLanguage;
  }

  public void setFavoriteLanguage(String favoriteLanguage) {
    this.favoriteLanguage = favoriteLanguage;
  }
}
