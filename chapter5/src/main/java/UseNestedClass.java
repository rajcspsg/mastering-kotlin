import d1.nested.classess.Outer;

public class UseNestedClass {
  public static void main(String[] args) {
    Outer o = new Outer();
    Outer.Nested i = o.getNested();
    o.getNested();
  }
}
