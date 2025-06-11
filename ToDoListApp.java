import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = getChoice();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> removeTask();
                case 4 -> System.out.println("Exiting application. Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n==== TO-DO LIST MENU ====");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next(); // discard invalid input
        }
        return scanner.nextInt();
    }

    private static void addTask() {
        System.out.print("Enter the task: ");
        scanner.nextLine(); // consume leftover newline
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("\nTasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }

        System.out.print("Enter the task number or name to remove: ");
        scanner.nextLine(); // consume leftover newline
        String input = scanner.nextLine();

        try {
            int index = Integer.parseInt(input) - 1;
            if (index >= 0 && index < tasks.size()) {
                String removed = tasks.remove(index);
                System.out.println("Removed task: " + removed);
            } else {
                System.out.println("Invalid task number.");
            }
        } catch (NumberFormatException e) {
            if (tasks.remove(input)) {
                System.out.println("Removed task: " + input);
            } else {
                System.out.println("Task not found.");
            }
        }
    }
}
