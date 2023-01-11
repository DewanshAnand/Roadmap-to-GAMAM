public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {

        int[] res = new int[nums.length];
        int i=0;
        int k=nums.length-1;
        int j=nums.length-1;

        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[k] = nums[i] * nums[i];
                k--;
                i++;
            }else{
                res[k] = nums[j] * nums[j];
                k--;
                j--;
            }
        }
        return res;

    }
}

// LeetCode Link: https://leetcode.com/problems/squares-of-a-sorted-array/
