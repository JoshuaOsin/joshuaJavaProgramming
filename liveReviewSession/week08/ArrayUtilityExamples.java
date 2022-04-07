package week08;

import java.util.Arrays;

public class ArrayUtilityExamples {

    public static void main(String[] args) {

        int [] nums = {5, 10, 4, 1000, 35};

        System.out.println("before : "+ Arrays.toString(nums));

        // soring from smaller to larger
        Arrays.sort(nums);
        System.out.println("After sort : "+ Arrays.toString(nums));

        int [] nums2 = {4, 5, 10, 35, 1000};

        // Arrays' content are equal
        System.out.println("Equals ?  "+ Arrays.equals(nums,nums2));

        // == is checking references
        System.out.println(nums == nums2);

        // they are looking same reference, They are same object (remember pool)
        int [] nums3 = nums;
        nums[0] = 1;
        System.out.println(nums == nums3);

        int [] nums4 = Arrays.copyOf(nums,nums.length);




    }
}
