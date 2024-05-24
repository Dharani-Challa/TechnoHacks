import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View to-do list");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    viewToDoList();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a number from 1 to 4.");
            }
        }
    }

    private static void addItem(Scanner scanner) {
        System.out.println("Enter the item to add:");
        String newItem = scanner.nextLine();
        toDoList.add(newItem);
        System.out.println("Item added to the to-do list.");
    }

    private static void removeItem(Scanner scanner) {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is empty. Nothing to remove.");
            return;
        }
        System.out.println("Enter the index of the item to remove:");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        if (index >= 0 && index < toDoList.size()) {
            String removedItem = toDoList.remove(index);
            System.out.println("Item \"" + removedItem + "\" removed from the to-do list.");
        } else {
            System.out.println("Invalid index. Please enter a valid index from 0 to " + (toDoList.size() - 1) + ".");
        }
    }

    private static void viewToDoList() {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
