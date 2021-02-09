import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int next = list.get(i);
            int j = i - 1;
            while ((j > -1) && (list.get(j).compareTo(next) == 1)) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, next);
        }
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] merge = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0; 
                 
        while (i < arr1.length) {
            merge[k] = arr1[i];
            i++;
            k++;
        } 
                 
        while (j < arr2.length) {
            merge[k] = arr2[j];
            j++;
            k++;
        } 
        Arrays.sort(merge);
        return merge;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
