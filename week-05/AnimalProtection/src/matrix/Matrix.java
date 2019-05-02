package matrix;

import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("***");
        printMatrix(matrix);

    }

    public static void printMatrix (Integer[][] matrix) {

        matrix[0][0] = matrix[2][0];
        matrix[0][1] = matrix[1][0];
        matrix[0][2] = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}







