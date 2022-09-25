import java.util.ArrayList;
import java.util.List;

/**
 * Utility class contains the logic for traversing array
 */
public class TraversalLogic {

    public List<Integer> result = new ArrayList<>();
    public int[][] matrix;

    public TraversalLogic(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Utility method for traversing a given 2D array
     *
     * @return List with the elements of 2D array in a specific order
     */
    public List<Integer> traverseArray() {

        if(matrix.length == 0) {
            return new ArrayList<>();
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            // Traverses the first row from left to right
            for (int i = colBegin; i <= colEnd; i++) {
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            // Traverses the last column from top to bottom
            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // If it is not a column matrix then the below code gets executed
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            // If it is not a row matrix then the below code gets executed
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return result;
    }
}
