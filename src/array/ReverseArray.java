package array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array={0,1,2,3,4,5};
        System.out.println("The base of my array are " + Arrays.toString(array));

        reverse(array);

        System.out.println("The reverse my array are "+ Arrays.toString(array));

    }

    private static void reverse(int[] array ){
        int maxIndex = array.length -1;
        int half = array.length/2;

        for (int i=0 ; i<half ; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i]=temp;

        }

    }


}


