package SortPackage;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    // 递归的快速排序
    public int[] QSort(int[] arr, int left, int right) {
        if (left < right) {
            // 得到枢轴在正确排序中的位置
            int pos = getPivot(arr, left, right);
            // 对该枢轴的左部分进行快排
            QSort(arr, left, pos - 1);
            // 对该枢轴的右部分进行快排
            QSort(arr, pos + 1, right);
        }
        return arr;
    }

    //非递归的快排
    public int[] QSort2(int[] arr) {
        List<Integer> iList = new ArrayList<>();
        iList.add(0);
        iList.add(arr.length - 1);
        while (!iList.isEmpty()) {
            int left = iList.remove(iList.size() - 2), right = iList.remove(iList.size() - 1);
            if (left >= right) {
                continue;
            }
            int pos = getPivot(arr, left, right);
            // 这里的判断以下列例子佐证：eg：5 1 9，第一次：left=0，right=2.返回的pos=1
            // 那么下次左部分变成 left=0，right=pos-1=0，这种不必要进行getPivot，
            // 右部分变成 left=pos+1=2，right=2，这中也没有必要进行getPivot，
            // 所以 pos-1>left, pos+1<right时菜有必要进行 getPivot
            if (pos - 1 > left) {
                iList.add(left);
                iList.add(pos - 1);
            }
            if (pos + 1 < right) {
                iList.add(pos + 1);
                iList.add(right);
            }
        }
        return arr;
    }

    public int getPivot(int[] arr, int left, int right) {
        // 选部分数组的第一个为枢轴
        int pos = arr[left];
        while (left < right) {
            // 从右边开始比较，右指针指向的位置若比枢轴大，右指针--
            while (left < right && arr[right] >= pos) {
                right--;
            }
            // 右指针指向的位置若比枢轴小，右指针位置的数据移到左指针处
            arr[left] = arr[right];
            // 数据移动以后，再从左边开始比较，左边比枢轴小的，左指针++
            while (left < right && arr[left] <= pos) {
                left++;
            }
            // 左指针处数据比枢轴大，就把该数据换到右指针处
            arr[right] = arr[left];
        }
        // 直到 左指针=右指针，说明该位置就是枢轴应该放置的位置
        arr[left] = pos;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 3, 2, 5};
        QuickSort qs = new QuickSort();
//		qs.QSort(arr, 0, arr.length - 1);
        qs.QSort2(arr);
    }
}
