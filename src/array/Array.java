package array;

import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getArray(5);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " type value was " + myArray[i]);
        }

        System.out.println("The average is : " + averageArray(myArray));
        scanner.close();

    }

    public static int[] getArray(int number) {
        System.out.println("Enter your number " + number + " int valve \r");
        int[] value = new int[number];
        for (int i = 0; i < value.length; i++) {
            value[i] = Integer.parseInt(scanner.nextLine());
        }
        return value;
    }

    public static double averageArray(int[] aveArr) {
        int sum = 0;
        for (int i = 0; i < aveArr.length; i++) {
            sum += aveArr[i];
        }
        return (int) sum / aveArr.length;
        //why?
    }

    //scanner chera close nemisheh?

}
