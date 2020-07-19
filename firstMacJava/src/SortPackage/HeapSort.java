package SortPackage;

public class HeapSort {

    public int[] HeapSorts(int[] arr) {
        // 建立大顶堆
        BuildMaxHeap(arr, (arr.length - 1 - 1) / 2, arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            Swap(arr, i, 0);
            BuildMaxHeap(arr, (i - 1) / 2, i);
        }
        return arr;
    }

    private void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 在创建大顶堆的过程中，从最后一个非叶节点开始调整，
    private void BuildMaxHeap(int[] arr, int start, int len) {
        for (int i = start; i >= 0; i--) {
            // 向下调整
            AdjustDown(arr, i, len);
        }
    }

    // 调整的过程中 可能会影响到自己的子树，所以应该在循环着调节自己的子树
    private int[] AdjustDown(int[] arr, int start, int size) {
        int root = start;
        while (root < size) {
            int left = root * 2 + 1, right = root * 2 + 2;
            int temp = arr[root];
            if (right < size) { // 左右节点都存在
                int bigger = arr[left] > arr[right] ? left : right;
                if (arr[root] < arr[bigger]) { // 交换过 就改变下次要比较的节点
                    arr[root] = arr[bigger];
                    arr[bigger] = temp;
                    root = bigger;
                } else { // 没交换过就直接break
                    break;
                }
            } else if (right >= size && left < size) {  // 右节点不存在，左节点存在
                if (arr[root] < arr[left]) { // 交换过 就改变下次要比较的节点
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left; // 判断交换过的左右节点有没有子树，方便后续调整
                } else { // 没交换过就直接break
                    break;
                }
            } else { // 叶子节点 直接break
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {70, 10, 80, 60, 30, 96, 40, 20, 50, 51};
        HeapSort hs = new HeapSort();
        hs.HeapSorts(arr);
        System.out.println(arr);
    }

}
