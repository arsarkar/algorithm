package course.algorithm;

import org.junit.Test;

import course.advanced.SubSetSum;
import course.advanced.SubSetSumSeries;

import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    
{

	static int iArray[] = {23, 34,3, 47, 100, 23, 45, 123, 87, 36, 55, 46, 67, 101, 123};
	static int oArray[] = {3, 23, 23, 34, 36, 45, 46, 47, 55, 67, 87, 100, 101, 123, 123};

	@Test
	public void testIntertionSort(){
		assertArrayEquals(oArray, SortAlgorithms.insertionSort(iArray));
	}
	
	@Test
	public void testIntertionSortRV(){
		assertArrayEquals(oArray, SortAlgorithms.insertionSortRV(iArray));
	}
	
	@Test
	public void testQuickSort(){
		assertArrayEquals(oArray, SortAlgorithms.quickSortPureRecusion(iArray, 0, iArray.length-1));
	}
	
	@Test
	public void testIsMaxHeap(){
		int inputArray[] = {23, 34,3, 47, 100, 23, 45, 123, 87, 36, 55, 46, 67, 101, 123};
		assertTrue(SortAlgorithms.isMaxHeap(inputArray,7));
		assertTrue(SortAlgorithms.isMaxHeap(inputArray,4));
		assertTrue(!SortAlgorithms.isMaxHeap(inputArray,6));
	}
	
	@Test
	public void testMaxHeapify1(){
		int inputArray[] = {23, 34,3, 123, 100, 23, 45, 47, 87, 36, 55, 46, 67, 101, 123};
		int outputArray[] = {23, 123,3, 87, 100, 23, 45, 47, 34, 36, 55, 46, 67, 101, 123};
		assertArrayEquals(outputArray, SortAlgorithms.maxHeapify(inputArray, 1));
	}
	
	@Test
	public void testBuildMaxHeap1(){
		int[] A = new int[]{4,1,3,4,16,9,10,14,8,7};
		int[] B = new int[]{16,14,10,8,7,9,3,4,4,1};
		assertTrue(SortAlgorithms.isMaxHeap(SortAlgorithms.buildMaxHeap(A),0));
	}
	
	@Test
	public void testBuildMaxHeap2(){
		int inputArray[] = {23, 34,3, 123, 100, 23, 45, 47, 87, 36, 55, 46, 67, 101, 123};
		int outputArray[] = {123, 123, 101, 100, 87, 67, 55, 47, 46, 45, 36, 34, 23, 23, 3};
		assertTrue(SortAlgorithms.isMaxHeap(SortAlgorithms.buildMaxHeap(inputArray),0));
	}
	
	@Test
	public void testHeapSort(){
		int inputArray[] = {23, 34,3, 47, 100, 23, 45, 123, 87, 36, 55, 46, 67, 101, 123};
		int outputArray[] = {3, 23, 23, 34, 36, 45, 46, 47, 55, 67, 87, 100, 101, 123, 123};
		assertArrayEquals(outputArray, SortAlgorithms.heapSort(inputArray));
	}
	
	@Test
	public void testSubSetSum(){
		int set[] = {1, 2, 3, 4, 5, 6};
        int sum = 6;
        int n = set.length;
        SubSetSum sss = new SubSetSum();
        if (sss.isSubsetSum(set, n, sum) == true)
           System.out.println("Found a subset with given sum");
        else
           System.out.println("No subset with given sum");
	}
	
	@Test
	public void testSubSetSeries(){
		int set[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int sum = 25;
        int n = set.length;
        SubSetSumSeries sss = new SubSetSumSeries();
        int numSubSets = sss.isSubsetSum(set, n, sum);
        if (numSubSets > 0)
           System.out.println("Found a subset with given sum" + numSubSets);
        else
           System.out.println("No subset with given sum");
	}
	
}
