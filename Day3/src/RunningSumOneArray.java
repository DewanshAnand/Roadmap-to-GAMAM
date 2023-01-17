public class RunningSumOneArray {

    public int[] runningSum(int[] nums) {

        int[] totalSum = new int[nums.length];
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            totalSum[i] = sum;
        }
        return totalSum;
    }
}
