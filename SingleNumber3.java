class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int axorb = 0, a = 0, b = 0;
        for (int ele : nums) {
            axorb = axorb ^ ele;
        }
        int rbsm = axorb&(-axorb);
        for(int ele:nums){
            if((rbsm & ele) == 0){
                a = a^ele;
            }else{
                b=b^ele;
            }
        }
        ans[0]=a; ans[1]=b;
        return ans;
    }
}