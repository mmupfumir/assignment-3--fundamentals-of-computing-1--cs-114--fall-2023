import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the size of your matrix: ");
    int size = scanner.nextInt();

    Matrix matrix = new Matrix(size);

    System.out.println("Your matrix is" + size + "x" + size);
    System.out.println("Printing matrix with default values:");
    matrix.resetMatrix();
    matrix.printMatrix();

    System.out.println("Popultaing matrix...matrix populated");
    System.out.println("Printing matrix:");
    matrix.populateMatrix();
    matrix.printMatrix();

    System.out.println("Flipping matrix...matrix flipped");
    System.out.println("Printing flipped matrix: ");
    matrix.flipMatrix();
    matrix.printMatrix();

    scanner.close();
  }
}
