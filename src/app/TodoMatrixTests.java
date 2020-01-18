// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.time.*;
// import java.util.*;

// class TodoMatrixTests {
//     TodoMatrix todoMatrix;

//     @BeforeEach
//     void init() {
//         this.todoMatrix = new TodoMatrix();
//     }

//     @Test
//     void testAddItem() {
//         String title = "implement Matrix class";
//         LocalDate today = LocalDate.now();
//         LocalDate dateUrgent = today.plusDays(1);
//         LocalDate dateNotUrgent = today.plusDays(30);

//         this.todoMatrix.addItem(title, dateUrgent, true);
//         this.todoMatrix.addItem(title, dateUrgent, false);
//         this.todoMatrix.addItem(title, dateNotUrgent, true);
//         this.todoMatrix.addItem(title, dateNotUrgent, false);

//         TodoItem todoItem = (TodoItem) this.todoMatrix.getQuarters().get("IU").getItem(0);
//         assertEquals(title, todoItem.getTitle());

//         todoItem = (TodoItem) this.todoMatrix.getQuarters().get("IN").getItem(0);
//         assertEquals(title, todoItem.getTitle());

//         todoItem = (TodoItem) this.todoMatrix.getQuarters().get("NU").getItem(0);
//         assertEquals(title, todoItem.getTitle());

//         todoItem = (TodoItem) this.todoMatrix.getQuarters().get("NN").getItem(0);
//         assertEquals(title, todoItem.getTitle());
//     }

//     @Test
//     void testArchiveItems() {
//         String title = "implement Matrix class";
//         LocalDate today = LocalDate.now();
//         LocalDate dateUrgent = today.plusDays(1);
//         LocalDate dateNotUrgent = today.plusDays(30);

//         this.todoMatrix.addItem(title, dateUrgent, true);
//         this.todoMatrix.addItem(title, dateUrgent, false);
//         this.todoMatrix.addItem(title, dateNotUrgent, true);
//         this.todoMatrix.addItem(title, dateNotUrgent, false);

//         this.todoMatrix.getQuarters().get("IU").getItem(0).mark();
//         this.todoMatrix.getQuarters().get("IN").getItem(0).mark();
//         this.todoMatrix.getQuarters().get("NU").getItem(0).mark();
//         this.todoMatrix.getQuarters().get("NN").getItem(0).mark();

//         this.todoMatrix.archiveItems();

//         TodoQuarter todoQuarter = this.todoMatrix.getQuarters().get("IU");
//         assertTrue(todoQuarter.getItems().isEmpty(), "IU");

//         todoQuarter = this.todoMatrix.getQuarters().get("IN");
//         assertTrue(todoQuarter.getItems().isEmpty(), "IN");

//         todoQuarter = this.todoMatrix.getQuarters().get("NU");
//         assertTrue(todoQuarter.getItems().isEmpty(), "NU");

//         todoQuarter = this.todoMatrix.getQuarters().get("NN");
//         assertTrue(todoQuarter.getItems().isEmpty(), "NN");
//     }

//     @Test
//     void testSaveItemsToFile() throws IOException {
//         String fileIn = "todo_items_read_test.csv";
//         String fileOut = "todo_items_save_test.csv";

//         this.todoMatrix.addItemsFromFile(fileIn);
//         this.todoMatrix.saveItemsToFile(fileOut);

//         List<String> expectedList = new ArrayList<>();
//         expectedList.add("make a coffee  |14-10| important");
//         expectedList.add("read about OOP  |15-10| important");
//         expectedList.add("give mentors a feedback  |23-10| important");

//         BufferedReader reader = new BufferedReader(new FileReader(fileOut));
//         StringBuilder builder = new StringBuilder();
//         String actualLine;

//         while ((actualLine = reader.readLine())!= null) {
//             builder.append(actualLine);
//         }

//         assertContains(expectedList, builder.toString());


//     }

//     void assertContains(List<String> expectedElements, String targetOutput) {

//         for (String element : expectedElements) {
//             assertTrue(targetOutput.contains(element));
//         }
//     }
// }
