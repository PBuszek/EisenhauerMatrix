// package app;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.junit.jupiter.api.Assertions.assertFalse;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// import java.time.*;

// class TodoItemTests {
//     TodoItem todoItem;

//     @BeforeEach
//     void init() {
//         String title = "implement ToDoItem class";
//         LocalDate deadline = LocalDate.of(2017, Month.JUNE, 4);

//         this.todoItem = new TodoItem(title, deadline);
//     }

//     @Test
//     void testConstructor() {
//         String title = "implement ToDoItem class";
//         LocalDate deadline = LocalDate.of(2017, Month.JUNE, 4);

//         TodoItem todoItem = new TodoItem(title, deadline);

//         assertEquals(title, todoItem.getTitle());
//         assertEquals(deadline, todoItem.getDeadline());

//         deadline = LocalDate.of(2015, Month.MAY, 16);
//         todoItem = new TodoItem(title, deadline);

//         assertEquals(title, todoItem.getTitle());
//         assertEquals(deadline, todoItem.getDeadline());
//     }

//     @Test
//     void testMarking() {
//         this.todoItem.mark();
//         assertTrue(todoItem.isDone(), "Item wasn't marked");

//         this.todoItem.unmark();
//         assertFalse(todoItem.isDone(), "Item wasn't unmarked");
//     }

//     @Test
//     void testToString() {
//         assertEquals("[ ] 4-6 implement ToDoItem class", this.todoItem.toString(), "No mark expected");

//         this.todoItem.mark();

//         assertEquals("[x] 4-6 implement ToDoItem class", this.todoItem.toString(), "Mark expected");
//     }
// }
