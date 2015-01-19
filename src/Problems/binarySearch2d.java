package Problems;

import java.util.Arrays;

public class binarySearch2d {

	private static int[] binarySearch2d(int[][] arr, int toFind) {
	    int[] index2d = new int[] { -1, -1 };

	    // find the row
	    int row = -1;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i][0] > toFind) {
	            break;
	        }
	        row = i;
	    }

	    if (row > -1) {
	        int indexInSecond = Arrays.binarySearch(arr[row], toFind);
	        if (indexInSecond > -1) {
	            index2d[0] = row;
	            index2d[1] = indexInSecond;
	        }
	    }
	    return index2d;
	}

	public static void main(String[] args){
	    int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
	            { 13, 14, 15, 16 } };

	    int[] found = binarySearch2d(mat, 12);
	    int element = mat[found[0]][found[1]];
	    System.out.println("Found: " + element + " at mat[" + found[0] + "]["
	            + found[1] + "]");
	}

}
