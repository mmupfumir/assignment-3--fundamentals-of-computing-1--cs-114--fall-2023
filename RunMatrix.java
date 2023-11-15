import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in)

    System.out.println("Please enter the size of your matrix")
    int size = scanner.nextInt();

    Matrix matrix = new Matrix(size);

    System.out.println("Default matrix:");
    matrix.populateMatrix();

    scanner.close();
  }
}
