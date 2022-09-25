import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for TraversalLogic.java
 */
public class TraversalLogicTest {

    @Test
    public void traversalLogicSquareMatrixTest() {
        int[][] squareMatrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        TraversalLogic traversalLogic = new TraversalLogic(squareMatrix);
        List<Integer> resultList = traversalLogic.traverseMatrix();
        List<Integer> expectedMatrix = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5));
        assertNotNull(resultList);
        assertEquals(9, resultList.size());
        assertEquals(expectedMatrix, resultList);
    }

    @Test
    public void traversalLogicRectangleMatrixTest() {
        int[][] recMatrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        TraversalLogic traversalLogic = new TraversalLogic(recMatrix);
        List<Integer> resultList = traversalLogic.traverseMatrix();
        List<Integer> expectedMatrix = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8));
        assertNotNull(resultList);
        assertEquals(12, resultList.size());
        assertEquals(expectedMatrix, resultList);
    }

    @Test
    public void traversalLogicColumnMatrixTest() {
        int[][] colMatrix = new int[][]{{1}, {4}, {9}, {12}};
        TraversalLogic traversalLogic = new TraversalLogic(colMatrix);
        List<Integer> resultList = traversalLogic.traverseMatrix();
        List<Integer> expectedMatrix = new ArrayList<>(Arrays.asList(1, 4, 9, 12));
        assertNotNull(resultList);
        assertEquals(4, resultList.size());
        assertEquals(expectedMatrix, resultList);
    }

    @Test
    public void traversalLogicRowMatrixTest() {
        int[][] rowMatrix = new int[][]{{1, 2, 3, 4}};
        TraversalLogic traversalLogic = new TraversalLogic(rowMatrix);
        List<Integer> resultList = traversalLogic.traverseMatrix();
        List<Integer> expectedMatrix = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertNotNull(resultList);
        assertEquals(4, resultList.size());
        assertEquals(expectedMatrix, resultList);
    }

    @Test
    public void traversalLogicEmptyMatrixTest() {
        int[][] emptyMatrix = new int[][]{};
        TraversalLogic traversalLogic = new TraversalLogic(emptyMatrix);
        List<Integer> resultList = traversalLogic.traverseMatrix();
        List<Integer> expectedMatrix = new ArrayList<>();
        assertNotNull(resultList);
        assertEquals(0, resultList.size());
    }

    @Test
    public void traversalLogicSingleElemMatrixTest() {
        int[][] singleElemMatrix = new int[][]{{1}};
        TraversalLogic traversalLogic = new TraversalLogic(singleElemMatrix);
        List<Integer> resultList = traversalLogic.traverseMatrix();
        List<Integer> expectedMatrix = new ArrayList<>(Arrays.asList(1));
        assertNotNull(resultList);
        assertEquals(1, resultList.size());
        assertEquals(expectedMatrix, resultList);
    }

    @Test
    public void traversalLogicSampleMatrixTest() {
        int[][] recMatrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        TraversalLogic traversalLogic = new TraversalLogic(recMatrix);
        List<Integer> resultList = traversalLogic.traverseMatrix();
        List<Integer> expectedMatrix = new ArrayList<>(Arrays.asList(1,2,3,4, 8,12,16, 15,14,13, 9,5, 6,7, 11,10));
        assertNotNull(resultList);
        assertEquals(16, resultList.size());
        assertEquals(expectedMatrix, resultList);
    }

}
