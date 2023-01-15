import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }

        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                ans.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }

        int[] ans1 = new int[ans.size()];
        int i=0;
        for(int nums : ans){
            ans1[i] = nums;
            i++;
        }

        return ans1;

    }
}
