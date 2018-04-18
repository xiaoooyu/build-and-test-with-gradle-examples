package org.gradle.example.simple;

/***
 * Hello World.
 */
public final class HelloWorld {

  /***
   * prevent to create instance for utility class.
   */
  private HelloWorld() { }

  /***
   *
   * @param args messages to print.
   */
  public static void main(final String[] args) {
    System.out.println("hello, world");
  }

  /***
   *
   */
  public static void doNothing() {
      // Empty if statement should be disliked by PMD
      // if (true) {
      // }
  }
}
