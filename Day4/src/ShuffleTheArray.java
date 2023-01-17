public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] x = new int[n];
        int[] y = new int[n];
        int[] ans = new int[2*n];

        for(int i=0; i<n; i++){
            x[i] = nums[i];
            y[i] = nums[i+n];
        }

        for(int i=0; i<n; i++){
            ans[i+i] = x[i];
            ans[i+i+1] = y[i];
        }

        return ans;

    }
}
