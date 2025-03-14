import java.util.ArrayList; 
import java.util.Scanner; 

public class TodoList2A { 
    private ArrayList<String> todoList; 

    // Constructor to initialize the ArrayList
    public TodoList2A() {
        todoList = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String task) {
        todoList.add(task);
        System.out.println("Task added successfully!");
    }

    // Method to remove a task
    public void removeTask(String task) {
        if (todoList.remove(task)) {
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Task not found.");
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        if (todoList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("\nTo-Do List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    // fitur search task by index
    public void searchTaskByIndex(int index) {
        if (index >= 0 && index < todoList.size()) {
            System.out.println("Task at index " + (index + 1) + ": " + todoList.get(index));
        } else {
            System.out.println("Invalid index. No task found.");
        }
    }

    // fitur remo task by index
    public void removeTaskByIndex(int index) {
        if (index >= 0 && index < todoList.size()) {
            String removedTask = todoList.remove(index);
            System.out.println("Task \"" + removedTask + "\" removed successfully!");
        } else {
            System.out.println("Invalid index. Task not removed.");
        }
    }



    public static void main(String[] args) {
        TodoList2A app = new TodoList2A();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task By Task Name");
            System.out.println("3. Remove Task By Index");
            System.out.println("4. Search Task By index");
            System.out.println("5. Display Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    app.addTask(taskToAdd);
                    break;

                case 2:
                    System.out.print("Enter task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    app.removeTask(taskToRemove);
                    break;

                case 3:
                    System.out.print("Enter index to remove: ");
                    int indexToRemove = scanner.nextInt() - 1;
                    app.removeTaskByIndex(indexToRemove);
                    break;

                case 4:
                    System.out.print("Enter index to search: ");
                    int indexToSearch = scanner.nextInt() - 1;
                    app.searchTaskByIndex(indexToSearch);
                    break;

                case 5:
                    app.displayTasks();
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}