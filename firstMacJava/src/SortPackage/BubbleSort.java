package SortPackage;

public class BubbleSort {

    public int[] BubbleSort1(int[] arr) {
        // 循环n-1趟
        for (int i = 0; i < arr.length - 1; i++) {
            // 相邻两个数值比较,并设比较下标从0开始,到排好序的前一个下标为止
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // 设置标记变量 记录是否发生交换
    public int[] BubbleSort2(int[] arr) {
        boolean flag = true;
        int len = arr.length;
        while (flag) {
            flag = false;
            for (int j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            len--;
        }
        return arr;
    }

    // 设置标记变量 记录一趟排序过程中 发生交换的最后位置
    // 下一趟排序直接从下标0到 标记变量记录的位置处
    // 该标记变量也可看做 无序的数组长度
    public int[] BubbleSort3(int[] arr) {
        int len = arr.length;
        int flag = len;
        while (flag > 0) {
            flag = 0;
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = i + 1;
                }
            }
            len = flag;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 11};
        BubbleSort bs = new BubbleSort();
        arr = bs.BubbleSort1(arr);
//		arr = bs.BubbleSort2(arr);
//		arr = bs.BubbleSort3(arr);

        System.out.println(arr.toString());
    }
}
