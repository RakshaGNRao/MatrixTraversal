import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * Main class for array traversal
 */
@Slf4j
public class ArrayTraversal {

    public static void main(String[] args) {

        int[][] inputArr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        List<Integer> result;
        TraversalLogic traversalLogic = new TraversalLogic(inputArr);
        result = traversalLogic.traverseMatrix();
        log.info(result.toString());
    }
}
