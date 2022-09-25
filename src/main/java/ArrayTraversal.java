import java.util.List;

/**
 * Main class for array traversal
 */
public class ArrayTraversal {

    public static void main(String[] args) {
        int[][] inputArr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result;
        TraversalLogic traversalLogic = new TraversalLogic(inputArr);
        result = traversalLogic.traverseArray();
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
