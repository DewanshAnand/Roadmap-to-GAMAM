public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
            }

            if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}

// LeetCode Link : https://leetcode.com/problems/majority-element/
