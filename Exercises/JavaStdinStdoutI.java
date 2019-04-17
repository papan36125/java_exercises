import java.util.*;
public class JavaStdinStdoutI{
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // String myString = scanner.next();
    // int myInt = scanner.nextInt();
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    scan.close();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
