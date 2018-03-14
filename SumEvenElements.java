
/*получить сумму чётных элементов челочисленного массива*/

import java.util.Random;

public class SumEvenElements {

    public static void main(String[] args) {

        int[] array = new int[20];

        Random random = new Random();
        int num, sum = 0;
        for (int i = 0; i < array.length; i++) {
            num = random.nextInt(101);
            array[i] = num;

            System.out.print(array[i] + " ");

            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Sum Even Elements = " + sum);
    }
}
