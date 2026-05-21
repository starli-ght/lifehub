import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    TaskManager TM = new TaskManager();

    boolean running = true;

    public void start() {

        while (running) {
            showMenu();
            handleInput();
        }
    }

    void showMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
    }

    void handleInput() {
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Add task selected");
            System.out.println("Please enter task name.");
            String name = scanner.nextLine();

            System.out.println("Current selected name: " + name);
            System.out.println("Confirm to add task? [Y/n]");

            String yesorno = scanner.nextLine();

            if (yesorno.equals("Y") || yesorno.equals("y")) {
                TM.add(name);
                System.out.println("Task added!");
            }
            else if (yesorno.equals("N") || yesorno.equals("n")) {
                System.out.println("Cancelled.");
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
        else if (choice == 2) {
            System.out.println("View tasks selected");
            TM.view();
        }

        else if(choice == 3){
            System.out.println("Remove Task selected.");
            System.out.println("Enter task name to remove: ");
            String name = scanner.nextLine();
            System.out.println("Confirm to remove task " + name + " [Y/n]");
            String confirm = scanner.nextLine();
            if(confirm.equals("Y") || confirm.equals("y")){
                TM.remove(name);
                System.out.println("Task removed!");
            } else if (confirm.equals("n") || confirm.equals("N")){
                System.out.println("Cancelled.");
            } else {
                System.out.println("Invalid option.");
            }
        }

        else if (choice == 4) {
            running = false;
        }
        else {
            System.out.println("Invalid option");
        }
    }
}
