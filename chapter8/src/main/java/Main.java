public class Main {

  public static void main(String[] args) {
    GreetingsHelper.sayHello("Raj");
    System.out.println(Constants.getScreenCount());

    Student s = new Student();
    System.out.println(s);

    System.out.println(Widget.getFoo());
    Widget.Companion.goo();
    Widget.goo();
  }
}
