package day26_CustomMethodPractice;

public class ReverseArray {


    // reverse the given array, return reversed array
    public static int[] reverse(int[] arr) {
        int [] reversed = new int[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }
}
