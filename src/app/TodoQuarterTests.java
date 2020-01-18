// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// import java.time.*;
// import java.util.*;

// class TodoQuarterTests {
//     TodoQuarter todoQuarter;

//     @BeforeEach
//     void init() {
//         this.todoQuarter = new TodoQuarter();
//     }

//     @Test
//     void testConstructor() {
//         assertTrue(this.todoQuarter.getItems().isEmpty());
//     }

//     @Test
//     void testAddItem() {
//         String title = "implement Quarter class";
//         LocalDate deadline = LocalDate.of(2017, Month.JULY, 4);

//         this.todoQuarter.addItem(title, deadline);
//         TodoItem todoItem = (TodoItem) this.todoQuarter.getItems().get(0);

//         assertEquals(title, todoItem.getTitle());
//         assertEquals(deadline, todoItem.getDeadline());
//     }

//     @Test
//     void testGetItem() {
//         String title = "implement Quarter class";
//         LocalDate deadline = LocalDate.of(2017, Month.JULY, 4);

//         this.todoQuarter.addItem(title, deadline);
//         TodoItem todoItem = this.todoQuarter.getItem(0);

//         assertTrue(todoItem instanceof TodoItem);
//     }

//     @Test
//     void testSortItems() {
//         String title = "implement Quarter class";
//         List<LocalDate> deadlines = new ArrayList<LocalDate>();
//         deadlines.add(LocalDate.of(2017, Month.JUNE, 14));
//         deadlines.add(LocalDate.of(2017, Month.MAY, 24));
//         deadlines.add(LocalDate.of(2017, Month.JUNE, 4));
//         deadlines.add(LocalDate.of(2017, Month.JULY, 3));
//         deadlines.add(LocalDate.of(2017, Month.JUNE, 23));

//         for (LocalDate deadline : deadlines) {
//             this.todoQuarter.addItem(title, deadline);
//         }

//         TodoItem todoItem = (TodoItem) this.todoQuarter.getItems().get(0);
//         assertEquals(deadlines.get(1), todoItem.getDeadline(), "Item index: 0");

//         todoItem = (TodoItem) this.todoQuarter.getItems().get(1);
//         assertEquals(deadlines.get(2), todoItem.getDeadline(), "Item index: 1");

//         todoItem = (TodoItem) this.todoQuarter.getItems().get(2);
//         assertEquals(deadlines.get(0), todoItem.getDeadline(), "Item index: 2");

//         todoItem = (TodoItem) this.todoQuarter.getItems().get(3);
//         assertEquals(deadlines.get(4), todoItem.getDeadline(), "Item index: 3");

//         todoItem = (TodoItem) this.todoQuarter.getItems().get(4);
//         assertEquals(deadlines.get(3), todoItem.getDeadline(), "Item index: 4");
//     }

//     @Test
//     void testRemoveItem() {
//         String title = "go to Codecool";
//         LocalDate deadline = LocalDate.of(2017, Month.JULY, 4);
//         this.todoQuarter.addItem(title, deadline);

//         title = "make coffee";
//         deadline = LocalDate.of(2017, Month.JUNE, 14);
//         this.todoQuarter.addItem(title, deadline);

//         title = "code";
//         deadline = LocalDate.of(2017, Month.SEPTEMBER, 24);
//         this.todoQuarter.addItem(title, deadline);

//         this.todoQuarter.removeItem(1);

//         TodoItem todoItem = (TodoItem) this.todoQuarter.getItems().get(1);

//         assertEquals("code", todoItem.getTitle());
//         assertEquals(2, this.todoQuarter.getItems().size());
//     }

//     @Test
//     void testArchiveItems() {
//         String title = "go to Codecool";
//         LocalDate deadline = LocalDate.of(2017, Month.JUNE, 16);
//         this.todoQuarter.addItem(title, deadline);

//         title = "make coffee";
//         deadline = LocalDate.of(2017, Month.JUNE, 14);
//         this.todoQuarter.addItem(title, deadline);

//         title = "code";
//         deadline = LocalDate.of(2017, Month.JULY, 24);
//         this.todoQuarter.addItem(title, deadline);

//         this.todoQuarter.getItem(0).mark();
//         this.todoQuarter.archiveItems();

//         TodoItem todoItem = (TodoItem) this.todoQuarter.getItems().get(0);

//         assertEquals("go to Codecool", todoItem.getTitle());
//         assertEquals(2, this.todoQuarter.getItems().size());
//     }

//     @Test
//     void testToString() {
//         String title = "go to Codecool";
//         LocalDate deadline = LocalDate.of(2017, Month.JUNE, 16);
//         this.todoQuarter.addItem(title, deadline);

//         title = "make coffee";
//         deadline = LocalDate.of(2017, Month.JUNE, 14);
//         this.todoQuarter.addItem(title, deadline);

//         title = "code";
//         deadline = LocalDate.of(2017, Month.JULY, 24);
//         this.todoQuarter.addItem(title, deadline);

//         this.todoQuarter.getItem(1).mark();

//         String expected = "1. [ ] 14-6 make coffee\n2. [x] 16-6 go to Codecool\n3. [ ] 24-7 code\n";
//         assertEquals(expected, this.todoQuarter.toString());
//     }
// }
