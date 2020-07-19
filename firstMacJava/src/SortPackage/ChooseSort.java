package SortPackage;

public class ChooseSort {

    // 把最小值的下标 记下，该位置 与下标i互换
    public int[] ChooseSort1(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public int[] ChooseSort2(int[] arr) {
        int min = 0, max = 0, left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            min = max = left;
            for (int i = left; i <= right; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }
            int temp = arr[left];
            arr[left] = arr[min];
            arr[min] = temp;
            // 当 left指向的就是最大值时
            // 第一次交换已经把最大值left与记录的最小值min交换了
            // 第二次交换时 最大值就不是记录的max 而是已经换到的最小值处min
            if (left == max) {
                max = min;
            }
            temp = arr[right];
            arr[right] = arr[max];
            arr[max] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 11, 4, 9, 8};
        ChooseSort cs = new ChooseSort();
        cs.ChooseSort2(arr);
    }
}
