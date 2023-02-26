package Examples.HomeWork_05;

// Реализовать алгоритм пирамидальной сортировки (HeapSort)

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Ex03_HeapSort {
    static ArrayList<Integer> list = new ArrayList<>(
            List.of(11, 3, 5, 21, 28, 50, 2, 10, 23, 44, 18, 7, 19, 69));

    public static void main(String[] args) {
        System.out.println(list);

        ArrayList<Integer> sortedList = heapSort(list, list.size());
        System.out.println(sortedList);
    }

    
    private static ArrayList<Integer> heapSort(ArrayList<Integer> list, int length) {

        if (length == 1) return list;


        int lastParent = findLastParentIndex(length);


        for (int parent = lastParent; parent >= 0; parent--) {
            int leftChild = parent * 2 + 1;
            int rightChild = parent * 2 + 2;

            if (leftChild == length - 1) rightChild = leftChild;

            int max = leftChild;
            if (list.get(rightChild) > list.get(max)) max = rightChild;

            if (list.get(parent) < list.get(max)) swapIndexes(list, max, parent);
        }
        swapIndexes(list, 0, length - 1);
        return heapSort(list, length - 1);
    }

    private static int findLastParentIndex(int length) {
        return 0;
    }

    
    private static void swapIndexes(ArrayList<Integer> list, int i, int j) {
        Collections.swap(list, i, j);
    }
}
