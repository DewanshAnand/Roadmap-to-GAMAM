import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }

        for(int a:set1){
            if(set2.contains(a)){
                ans.add(a);
            }
        }

        int[] ans1 = new int[ans.size()];

        for(int i=0; i<ans.size(); i++){
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}
