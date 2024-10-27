import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> powerSet(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans= new ArrayList<>();
        
        for(int i=0;i<(1<<n);i++){
            int mask =1;
            List<Integer> list = new ArrayList<>();
            for(int j=1;j<=n;j++){
                if((i&mask) > 0){
                    list.add(nums[n-j]);
                }
                mask=mask<<1;
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}