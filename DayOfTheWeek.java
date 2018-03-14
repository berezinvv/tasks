
/*написать функцию, которая принимает номер дня недели, а возвращает строку с названием дня недели*/
/*1-Sunday
2-Monday
3-Tuesday
4-Wednesday
5-Thursday
6-Friday
7-Saturday*/

import java.util.Scanner;

public class DayOfTheWeek {

    static String Day(int num) {

        if (num < 1 || num > 7) {
            return "invalid day";
        }
        switch (num) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
        }
        return "invalid day";
    }

    public static void main(String[] args) {
        System.out.print("Enter day of the week: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(Day(number));
    }
}
