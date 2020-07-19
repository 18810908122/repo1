package LeetCode;

public class ClimbStairs_70 {

    public static void main(String[] args) {

        ClimbStairs_70 cs70 = new ClimbStairs_70();
        System.out.println(cs70.climbStairs2(42));
        System.out.println(cs70.climbStairs2(43));
        System.out.println(cs70.climbStairs2(44));

        System.out.println(cs70.climbStairs(42));
        System.out.println(cs70.climbStairs(43));
        System.out.println(cs70.climbStairs(44));

    }

    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // 斐波那契的 空间优化版本
    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int first = 1, last = 2, result = 0;

        while (n > 2) {
            result = first + last;
            first = last;
            last = result;
            n--;
        }
        return result;
    }
}
