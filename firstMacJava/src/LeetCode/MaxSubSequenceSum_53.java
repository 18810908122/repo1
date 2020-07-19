package LeetCode;

public class MaxSubSequenceSum_53 {

    public static void main(String[] args) {
        MaxSubSequenceSum_53 mss = new MaxSubSequenceSum_53();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(mss.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            int a = nums[i];
            int b = dp[i - 1] + nums[i];
            dp[i] = Math.max(a, b);
        }
        // 最后这一步，是求一个全局的最优值
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
