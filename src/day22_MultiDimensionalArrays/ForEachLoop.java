package day22_MultiDimensionalArrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        for (int[] each1DArray : arr2D) {
            for (int eachElements : each1DArray) {
                System.out.print(eachElements +" ");
            }
            System.out.println();
        }


    }
}
