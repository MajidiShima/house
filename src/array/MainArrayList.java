package array;

import java.util.Scanner;

public class MainArrayList {
    private static Scanner scanner = new Scanner(System.in);
    private static MYFirstArrayList groceryList = new MYFirstArrayList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstrucation();
        while (!quit) {
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstrucation();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    printGroceryList();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstrucation() {
        System.out.println("\npress ");
        System.out.println("\t0 - To print choice option.");
        System.out.println("\t1 - To add an item to grocery list.");
        System.out.println("\t2 - To print grocery list.");
        System.out.println("\t3 - To modify grocery list .");
        System.out.println("\t4 - To remove item in  grocery list .");
        System.out.println("\t5 - To search  item in  grocery list .");
        System.out.println("\t6 - To quit item in  grocery list .");

    }

    public static void addItem() {
        System.out.println("Please enter the grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void printGroceryList() {
        groceryList.printGroceryList();
    }

    public static void modifyItem() {
        System.out.println("Enter item number : ");
        int ItemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new Item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(ItemNumber - 1, newItem);// -1 bec of ArrayList starting with 0
    }

    public static void removeItem() {
        System.out.println("Enter item number");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber - 1);

    }

    public static void searchItem() {
        System.out.println("item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("found " + searchItem + "in our grocery list ");
        } else {
            System.out.println(searchItem + "is not in the shopping list");
        }


    }


}