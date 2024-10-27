public class SingleNumber1 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int ele:nums){
            ans= ans^ele;
        }
        return ans;
    }
}
