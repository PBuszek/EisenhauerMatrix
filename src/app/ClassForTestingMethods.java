package app;

public class ClassForTestingMethods {
    public static void main(String[] args) {
        // # \033[0;34m --------------> blue
        // # \033[0;34;44m --------------> blue + background blue
        // # \033[0;33m --------------> yellow, almost brown
        // # \033[0;35m --------------> magenta
        // # \033[0;32m --------------> green
        // # \033[1;31m --------------> red
        // # \033[1;31m --------------> red
        // # \033[1;31;41m --------------> red + background red
        // # \033[1;30m --------------> black font
        // # \033[0;40m --------------> black background
        // # \033[0;42m --------------> green background
        // # \033[0;32;42m --------------> green background
    }




    // // public String toString(int sizeOfQuarter) {
    //     public String toString() {
    //         String todoItemsListAsString = ""; // "";
    //         int counter = 1;
    //         for (int i = 0; i < todoItems.size(); i++) {
    //             if (todoItems.get(i).getIsDone()) {
    //                 todoItemsListAsString = "\033[0;37;49m" + todoItemsListAsString + counter + ". ";
    //                 todoItemsListAsString = todoItemsListAsString + "[x] "
    //                         + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle()
    //                         + "\n";
    //             } else {
    //                 if (todoItems.get(i).getDeadline().isAfter(dateNow.plusDays(3))) {
    //                     // System.out.println("\033[0;32;49m qwqwe");
    //                     todoItemsListAsString = "\033[0;32;49m" + todoItemsListAsString + counter + ". ";
    //                     todoItemsListAsString = todoItemsListAsString + "[ ] "
    //                             + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle()
    //                             + "\n"; // + "\033[0;37;49m";
    //                     // System.out.print("\033[0;37;49m");
    
    //                 } else if (todoItems.get(i).getDeadline().equals(dateNow)) {
    //                     todoItemsListAsString = "\033[0;31;49m" + todoItemsListAsString + counter + ". ";
    //                     todoItemsListAsString = todoItemsListAsString + "[ ] "
    //                             + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle()
    //                             + "\n"; // + "\033[0;37;49m";
    
    //                 } else if (todoItems.get(i).getDeadline().isAfter(dateNow)
    //                         && todoItems.get(i).getDeadline().isBefore(dateNow.plusDays(3))) {
    //                     todoItemsListAsString = "\033[0;33;49m" + todoItemsListAsString + counter + ". ";
    //                     todoItemsListAsString = todoItemsListAsString + "[ ] "
    //                             + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle()
    //                             + "\n"; // + "\033[0;37;49m";
    
    //                 }
    //                 // todoItemsListAsString = todoItemsListAsString + counter + ". ";
    //                 // todoItemsListAsString = todoItemsListAsString + "[ ] " +
    //                 // todoItems.get(i).getDeadline().toString().substring(5) + " " +
    //                 // todoItems.get(i).getTitle() + "\n";
    //             }
    //             counter++;
    //         }
    //         return todoItemsListAsString;
    //     }
}