package mix;

import java.util.Scanner;

public class MatrixMultiplication {


    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base of squared matrix");

        n = scan.nextInt();

        // defining 3 two dimentional arrays
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        System.out.println("Enter the first Matrix:");
        // getting input for first matrix
        for (int i=0;i<n;i++) {

            for (int j=0;j<n;j++) {

                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the second Matrix:");
        // getting input for second matrix
        for (int i=0;i<n;i++) {

            for (int j=0;j<n;j++) {

                b[i][j] = scan.nextInt();
            }
        }


        System.out.println("The matrix multiplication of two matrix is :");
        // doing matrix multiplication
        for (int i =0; i<n;i++) {

            for (int j=0;j<n;j++) {

                for (int k=0; k<n;k++) {

                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        // print the result

        for (int i=0;i<n;i++) {

            for (int j=0;j<n;j++) {

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
