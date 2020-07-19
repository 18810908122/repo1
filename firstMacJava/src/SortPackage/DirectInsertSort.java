package SortPackage;

public class DirectInsertSort {

    public int[] DirectInsertSort1(int[] arr) {
        // 外层循环控制每一次参与比较的第一个数是 右边无序的 第一个
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i - 1;
            // i比j大，所以后移过程中可能会覆盖arr[i],
            // 故 应该用temp与左边排好序的数值比，而不是arr[i]
            // 内层循环 从后往前 遍历左边有序序列，
            // 控制每一次参与比较的第二个数是 左边有序的值
            for (; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    // 使用数组第一个位置 作为哨兵
    public int[] DirectInsertSort2(int[] arr) {
        // 外层循环控制每一次参与比较的第一个数是 右边无序的 第一个
        for (int i = 1; i < arr.length; i++) {
            // 第一个位置赋值为哨兵，即存放该趟排序中待插入的元素
            arr[0] = arr[i];
            int j = i - 1;
            // 内层循环的判断条件 只进行一次比较
            for (; arr[0] < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = arr[0];
        }
        return arr;
    }

    // 二分查找插入排序
    public int[] DirectInsertSort3(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int left = 0, right = i - 1, mid = 0;
            if (arr[right] > arr[i]) {
                // 找到待插入元素在 有序部分的位置mid
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (arr[i] > arr[mid]) {
                        left = mid + 1;
                    } else if (arr[i] < arr[mid]) {
                        right = mid - 1;
                    } else { // 当mid处的值等于待插入时，说明下一个位置是待插入数值的正确位置
                        break;
                    }
                }
                // 如果找到的 mid下标处的值比待插入元素小，
                // 说明mid的下一个才是应该插入的位置，
                // 如 1 3 5 2，插入2时，上面得出mid=0，但是2实际应该放在1后边，也就是下标1处
                if (arr[mid] <= arr[i]) {
                    mid++;
                }
                // 找到位置mid，mid往右的有序部分均后移
                int temp = arr[i];
                for (int j = i; j > mid; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[mid] = temp;
            }
        }
        return arr;
    }

    public int[] ShellSort(int[] arr) {
        int d = 6;
        while (d >= 1) { // 控制步长
            //  对每组进行步长为d的直接排序
            for (int i = d; i < arr.length; i = i + d) {
                int temp = arr[i], j = i - d;
                for (; j >= 0 && arr[j] > temp; j = j - d) {
                    arr[j + d] = arr[j];
                }
                arr[j + d] = temp;
            }
            d /= 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 1, 8, 4, 5, 7};
//		int[] arr1 = { 0, 3, 1, 6, 4, 5, 2 };
        DirectInsertSort dis = new DirectInsertSort();
        // 普通直接插入排序
//		dis.DirectInsertSort1(arr);

        // 使用哨兵
//		dis.DirectInsertSort2(arr1);

        //  二分查找插入排序
//		dis.DirectInsertSort3(arr);

        // 希尔排序
        dis.ShellSort(arr);
    }
}
