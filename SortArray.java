
/*отсортировать целочисленный массив*/

import java.util.Random;

public class SortArray {

    public static void main(String[] args) {
        int[] array = new int[20];

        Random random = new Random();
        int num, temp = 0;
        for (int i = 0; i < array.length; i++) {
            num = random.nextInt(101);
            array[i] = num;

            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}
