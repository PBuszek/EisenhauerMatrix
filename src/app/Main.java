package app;

import java.time.LocalDate;
import java.util.Scanner;

// TODO:
//   - all fields private                   DONE!
//   - read data from file                  WIP!
//   - export data                    
//   - coloured marked                      DONE!  
//   - matrix formatted                     
//   - undo marking                         DONE
//   - automatically archive                DONE!
//   - inputing info about item             DONE!

public class Main {
    public static void main(String[] args) {
        LocalDate deadline = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        TodoMatrix eisenhowerMatrix = new TodoMatrix();

        System.out.println("----------------");

        eisenhowerMatrix.addItem("Call my bank", deadline.plusDays(8), false);

        eisenhowerMatrix.addItem("testing item1", deadline.plusDays(10), false);
        eisenhowerMatrix.addItem("testing item2", deadline.plusDays(5), true);
        eisenhowerMatrix.addItem("testing item3", deadline.plusDays(0), false);
        eisenhowerMatrix.addItem("testing item4", deadline.plusDays(1), true);
        eisenhowerMatrix.addItem("testing item5", deadline.plusDays(10), false);
        eisenhowerMatrix.addItem("testing item6", deadline.plusDays(4), true);
        eisenhowerMatrix.addItem("testing item7", deadline.plusDays(2), true);
        eisenhowerMatrix.addItem("testing item8", deadline.plusDays(0), false);
        eisenhowerMatrix.addItem("testing item9", deadline.plusDays(1), false);
        eisenhowerMatrix.getQuarter("NN").getItem(1).mark();
        System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");
        // eisenhowerMatrix.getQuarter("NN").getItem(2).mark();
        // System.out.println(eisenhowerMatrix.toString());

        // System.out.println("----------------");
        // eisenhowerMatrix.getQuarter("IN").removeItem(1);
        // System.out.println(eisenhowerMatrix.toString());

        // System.out.println("----------------");
        // eisenhowerMatrix.getQuarter("NN").removeItem(2);
        // System.out.println(eisenhowerMatrix.toString());

        // System.out.println("----------------");
        // eisenhowerMatrix.archiveItems(); // DELETE MARKED!
        // System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");
        // 32 = green > 3
        // 33 = orange > 0 && <= 3
        // 31 = red = 0
        // 37 = default (marked)

        while (isRunning) {
            System.out.println("\033[0;37;49mMenu");
            System.out.println("Choose option");

            System.out.println("1. Add todo item");
            System.out.println("2. Show todo list");
            System.out.println("3. Archive all done todos");
            System.out.println("4. Mark todo");
            System.out.println("5. Unmark todo");
            System.out.println("6. Exit program");

            String choosedOption = scanner.nextLine();

            switch (choosedOption) {
            case "1":
                System.out.println("Enter todo note: ");

                String todoInputted = scanner.nextLine();

                System.out.println("Enter number of days this todo should be done: ");
                String deadlineInputted = scanner.nextLine();
                int deadlineInputtedInt = Integer.parseInt(deadlineInputted);

                System.out.println("Enter true or false if the todo is important: (true/false)");
                String isImportantInputted = scanner.nextLine();
                boolean isImportantInputtedBoolean = Boolean.valueOf(isImportantInputted);

                eisenhowerMatrix.addItem(todoInputted, deadline.plusDays(deadlineInputtedInt),
                        isImportantInputtedBoolean);

                System.out.println(eisenhowerMatrix.toString());
                break;

            case "2":
                System.out.println(eisenhowerMatrix.toString());
                break;

            case "3":
                eisenhowerMatrix.archiveItems();
                break;

            case "4":
            System.out.println("Enter which status of todo would you like to mark: ");
            String statusToMark = scanner.nextLine();

            System.out.println("Enter index of todo to mark:");
            String indexToMarkString = scanner.nextLine();
            int indexToMarkInt = Integer.parseInt(indexToMarkString) + 1;

            eisenhowerMatrix.getQuarter(statusToMark).getItem(indexToMarkInt).unmark();

            case "5":
                System.out.println("Enter which status of todo would you like to unmark: ");
                String statusToUnmark = scanner.nextLine();

                System.out.println("Enter index of todo to unmark:");
                String indexToUnmarkString = scanner.nextLine();
                int indexToUnmarkInt = Integer.parseInt(indexToUnmarkString) + 1;

                eisenhowerMatrix.getQuarter(statusToUnmark).getItem(indexToUnmarkInt).unmark();

            case "6":
                eisenhowerMatrix.archiveItems();
                System.exit(0);
                break;
            }
        }
    }
}