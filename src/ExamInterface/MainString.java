package ExamInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {

    }
        public static ArrayList<String> readValue() {

            ArrayList<String> values = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            int index = 0;
            System.out.println("choose an option\n "+
                    "1 to enter a string \n"+
                    "0 to quit");
            while (!quit){
                System.out.println("Choose an option :");
                int choose=scanner.nextInt();
                scanner.nextLine();
                switch (choose){
                    case 0:
                        quit=true;
                        break;
                    case 1:
                        System.out.println("Enter a string: ");
                        String stringInput=scanner.nextLine();
                        values.add(index,stringInput);
                        index++;
                        break;
                }
            }
            return values;
        }

}