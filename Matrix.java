public class Matrix {
  private final int size;
  private final int [][] matrix;

  public Matrix(int size) {
    this.size = size;
    this.matrix = new int [size][size];
  }

  public void populateMatrix() {
    int count = 1;
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++) {
        matrix[i][j] = count++;
    }
  }
}
  public void printMatrix() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
  }
}
}
