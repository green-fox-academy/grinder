import java.util.Arrays;

public class MatrixChangeSymericNumbers {

    public static void main(String[] args) {

        int[][] testMatrix = {{1,2,3}, {4,5,6}, {7,8,9,}}; //matrix for testing the getMatrix method
        System.out.println(Arrays.deepToString(testMatrix)); //prints the testMatrix in a fine form without using for loops

        getMatrix(testMatrix); //uses the method for the newMatrix
        System.out.println(Arrays.deepToString(getMatrix(testMatrix))); //prints the newMatrix in a fine form without using for loops
    }

    public static int[][] getMatrix(int[][] inputMatrix) {

        int[][] newMatrix = new int[inputMatrix.length][inputMatrix.length]; //initialize a new empty matrix

        for (int row = 0; row < inputMatrix.length; row++) { //use always two for loops in matrix
            for (int column = 0; column < inputMatrix.length; column++) {
                newMatrix[column][row] = inputMatrix[row][column]; //newMatrix with changes on the left side and inputMatrix with no changes on the right side
            }
        }
        return newMatrix;
    }
}


