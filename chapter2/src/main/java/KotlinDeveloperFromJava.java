public class KotlinDeveloperFromJava {
  public static void main(String[] args) {
    KotlinDeveloper kd = new KotlinDeveloper("raj", "kotlin");
    System.out.println(kd);
    LoggerKt.logMessage(kd.getName());
  }
}
