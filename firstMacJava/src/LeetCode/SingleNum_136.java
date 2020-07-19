package LeetCode;

public class SingleNum_136 {

    public static int getSingleNumber(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 3};

        System.out.println(Integer.toBinaryString(SingleNum_136.getSingleNumber(arr)));
        System.out.println(Integer.bitCount(5));
    }
}
