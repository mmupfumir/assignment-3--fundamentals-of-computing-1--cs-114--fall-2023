public class Matrix {
    private final int size;
    private final int[][] matrix;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    public void populateMatrix() {
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = count++;
            }
        }
    }

    private void swap(int x1, int y1, int x2, int y2) {
        int temp = matrix[y1][x1];
        matrix[y1][x1] = matrix[y2][x2];
        matrix[y2][x2] = temp;
    }

    public void flipMatrix() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size 1- i; j++) {
                swap(i, j, size - 1 - j, size - 1 - i);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || (i + j == size - 1 && i != j)) {
                    System.out.print("\u001B[33m" + matrix[i][j] + "\u001B[0m\t");
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
