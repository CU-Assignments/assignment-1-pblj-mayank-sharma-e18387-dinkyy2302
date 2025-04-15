import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        System.out.println("Enter 4 values for Matrix 1:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter 4 values for Matrix 2:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix2[i][j] = sc.nextInt();

        int[][] addition = new int[2][2];
        int[][] subtraction = new int[2][2];
        int[][] multiplication = new int[2][2];

        // Addition & Subtraction
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
                subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
            }

        // Multiplication
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];

        System.out.println("Addition:");
        printMatrix(addition);

        System.out.println("Subtraction:");
        printMatrix(subtraction);

        System.out.println("Multiplication:");
        printMatrix(multiplication);

        sc.close();
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
