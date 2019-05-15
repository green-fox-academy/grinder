import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] testMatrix = {{1,2,3}, {4,5,6}, {7,8,9,}}; //matrix for testing the getMatrix method
        System.out.println(Arrays.deepToString(testMatrix)); //prints the testMatrix in a fine form without using for loops

        getMatrix(testMatrix); //uses the method for the newMatrix
        System.out.println(Arrays.deepToString(testMatrix)); //prints the newMatrix in a fine form without using for loops
    }

    public static int[][] getMatrix(int[][] inputMatrix) {

        int[][] newMatrix = new int[inputMatrix.length][inputMatrix.length]; //initialize a new empty matrix

        for (int row = 0; row < inputMatrix.length; row++) { //use always two for loops in matrix
            for (int column = 0; column < inputMatrix.length; column++) {
                if(row == 1) { //this means, that we are at the second row
                    inputMatrix[row][column] *= 2; //and we multiply every number by 2
                }
            }
        }
        return newMatrix;
    }
}
