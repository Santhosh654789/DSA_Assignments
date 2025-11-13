package DSA_Assignments;

// Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears only once. 
// The relative order of the elements should be kept the same.
// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
// The first k elements of nums should contain the unique numbers in sorted order. 
//The remaining elements beyond index k - 1 can be ignored.

class Duplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) 
        return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int k = removeDuplicates(nums);

        System.out.println("Unique count (k): " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        
    }
}
