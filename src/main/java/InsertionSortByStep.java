import java.util.Scanner;

public class InsertionSortByStep {
    public static void insertionSortByStep(int[] list) {
        int key;
        for (int i = 1; i < list.length; i++) {
            key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {

                list[j + 1] = list[j];
                printArray(list);
            }
            list[j + 1] = key;
            System.out.println();
            printArray(list);
        }
    }

    static void printArray(int[] list) {
        for (int i =0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
