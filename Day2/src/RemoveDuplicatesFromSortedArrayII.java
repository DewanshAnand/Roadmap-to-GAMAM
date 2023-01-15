public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {

        int index = 1;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<3){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
