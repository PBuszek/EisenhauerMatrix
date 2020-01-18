package app;

import java.time.LocalDate;
import java.util.Scanner;

public class AddingTodo {
    TodoMatrix eisenhowerMatrix = new TodoMatrix();
    LocalDate deadline = LocalDate.now();
    Scanner scanner = new Scanner(System.in);

    public void addingOptionInMenu() {
        System.out.println("Enter todo note: ");

        String todoInputted = scanner.nextLine();

        System.out.println("Enter number of days this todo should be done: ");
        String deadlineInputted = scanner.nextLine();
        int deadlineInputtedInt = Integer.parseInt(deadlineInputted);

        System.out.println("Enter true or false if the todo is important: (true/false)");
        String isImportantInputted = scanner.nextLine();
        boolean isImportantInputtedBoolean = Boolean.valueOf(isImportantInputted);

        System.out.println(todoInputted);
        System.out.println(deadlineInputted);
        System.out.println(isImportantInputted);

        eisenhowerMatrix.addItem(todoInputted, deadline.plusDays(deadlineInputtedInt), isImportantInputtedBoolean);
        
    }
}