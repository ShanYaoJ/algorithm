import java.util.Arrays;


/**
 * exercise 2
 * */
public class exercise02 {
    /**
     * 插入排序     2022.01.05
     * @param arr
     *
     */
    public static void insertionSort(int[] arr){
        //待插入数
        int start = 1;
        //从第二个数开始循环  将每个数插入已经排好序的队列中
        for (; start < arr.length; start++) {
            //将数插入到合适的位置
            for (int i = start; i > 0 && arr[i] > arr[i-1]; i--) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] unSortArr = new int[]{31,41,59,26,41,58};
        System.out.println("original："+Arrays.toString(unSortArr));
        //排序
        insertionSort(unSortArr);
        System.out.println("sorted："+Arrays.toString(unSortArr));
    }
}
