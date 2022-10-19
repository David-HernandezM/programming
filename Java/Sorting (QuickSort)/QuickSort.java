import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] {88,47,85,70,92,17,58,21,84,10,61,20,45,
                1,9,93,16,41,77,42,8, 36,95,86,39,87,51,52,28,57,3,40,
                72,11,53,13,80,49,62,32,73,14,33,79,66,90,15,81,94,59};
        System.out.println("Array:\n");
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println("\nSorted array:\n");
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array, int a, int b) {
        if (b <= a) return;
        int i = a + 1;
        int j = b;
        while (i < j) {
            if (array[i] > array[a] && array[j] <= array[a]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i ++;
                j --;
            } else if (array[i] <= array[a]) {
                i++;
            } else {
                j--;
            }
        }
        if (array[i] > array[a]) {
            i--;
        }
        int temp = array[a];
        array[a] = array[i];
        array[i] = temp;
        quickSort(array, a, i-1);
        quickSort(array, i+1, b);
    }
}
