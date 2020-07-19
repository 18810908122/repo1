package SortPackage;

public class MergeSort {

    // low、high表示 分 的时候 上下界
    public int[] MergeSort0(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            MergeSort0(arr, low, mid); // 分
            MergeSort0(arr, mid + 1, high); // 分
            Merge(arr, low, mid, high); // 治，即合并
        }
        return arr;
    }

    private void Merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high + 1];
        // 把待归并排序的部分单独开辟空间，这里会开辟多余的空间，
        // 例如归并下标2 3时，尽管用不到但还是会多开辟出下标0 1的空间
        for (int k = low; k <= high; k++) {
            temp[k] = arr[k];
        }
        int i, j, k; // i是左边待归并下标，j是右边待归并下标，这些下标是指在新开辟的空间上
        for (i = low, j = mid + 1, k = low; i <= mid && j <= high; k++) {
            // 左边 小于等于 右边时 取左边的值放到原数组中，这样可以保证排序稳定
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
        }
        // 这两个while只会执行一个。
        // 合并两部分时，总有一部分先排序完，while循环就是为了把剩下的直接放放到合并的部分
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
        while (j <= high) {
            arr[k++] = temp[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {70, 10, 60, 30, 40, 120, 50, 90, 80, 20, 110, 10};
        MergeSort ms = new MergeSort();
        ms.MergeSort0(arr, 0, arr.length - 1);
    }
}
