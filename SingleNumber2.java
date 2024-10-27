public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int ele : nums) {
                if ((ele & mask) != 0) {
                    cnt++;
                }
            }
            if (cnt % 3 == 1) {
                ans = (ans | mask);
            }
            mask = (mask << 1);
        }
        return ans;
    }
}
