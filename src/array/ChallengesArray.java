package array;

import java.util.Scanner;

public class ChallengesArray {
    public static Scanner scanner = new Scanner(System.in);   //static bodane scanner che  faideh dare??
    public static void main(String[] args) {

        int[] myArray=getArray(5);
        printArray(myArray);

    }


    public static int[] getArray(int capacity){
        int[] number=new int[capacity];
        System.out.println("Enter "+ capacity +" number : \r");
        for (int i=0; i<number.length;i++) {
            number[i] = Integer.parseInt(scanner.nextLine()); //chera vorodi intoreh;
        }
        return number;
    }

    public static void printArray(int [] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Element "+i+" with "+array[i]);
        }

    }
}
