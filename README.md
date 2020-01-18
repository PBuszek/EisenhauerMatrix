# The Eisenhower Matrix App

## The story

The Eisenhower Matrix is a great tool for time managing and improve your productivity. It is often used in IT projects teams to prioritize tasks.

Bob is a beginner Codecooler. He is a good self-learner, but he has a problem to focus on the only one thing in one moment. That's the reason that he sometimes feels lost in his job. Please help him to improve his efficiency and implement for him Eisenhower Matrix Application. He precised his expectations the user story.

## Tasks

1. Important & urgent: Implement all modules described in a specification.
2. Important & not urgent: Adjust it for user needs, based on the user story.
3. Not important & urgent: Fill up the specification (use markdown syntax).
4. Not important & not urgent: Add some extra features.


## The user story

1. As a user I would like to choose a status of shown TODO items:

  - urgent & important items
  - not urgent & important items
  - urgent & not important items
  - not urgent & not important items

    Urgent means that there's 3 days (72 hours) to deadline at most.

2. As a user I would like to see a list TODO items sorted decreasing by deadline from chosen matrix's quarter with its details.

3. As a user I would like to see a deadline formatted to *day-month*. I use matrix for the 2017 year.

4. As a user I would like to add an item with its deadline and priority, which is automatically assign to a properly quarter.

5. As a user I would like to mark TODO item by cross if it's done.

6. As a user I would like to undo marking a TODO item.

7. As a user I would like to remove a chosen TODO item.

8. As a user I would like to archive TODO items - remove all done items.

9. As a user I would like to keep all my TODO items in a .csv files.

10. As a user I would like to automatically archive all done tasks before save items and quit the application.

11. As a user I would like to see a whole Eisenhower matrix (every quarter with its items).

### Extras:

12. As a user I would like to see colored (only unmarked) todo_items:
  - green: if the deadline is coming far than 3 days
  - orange: if deadline is coming in the next 3 days
  - red: if deadline is today

13. As a user I would like to see a matrix formatted to the following table.

```
"
    |            URGENT              |           NOT URGENT           |  
  --|--------------------------------|--------------------------------|--
    | 1. [ ] 9-6  go to the doctor   |                                |
    | 2. [x] 11-6 submit assignment  |                                |
  I |                                |                                |
  M |                                |                                |
  P |                                |                                |
  O |                                |                                |
  R |                                |                                |      
  T |                                |                                |
  A |                                |                                |
  N |                                |                                |
  T |                                |                                |
    |                                |                                |
    |                                |                                |
  --|--------------------------------|--------------------------------|--                               
  N | 1. [ ] 14-6 buy a ticket       | 1. [x] 30-5 House of Cards     |
  O |                                |                                |
  T |                                |                                |
    |                                |                                |
  I |                                |                                |
  P |                                |                                |
  O |                                |                                |
  R |                                |                                |
  T |                                |                                |
  A |                                |                                |
  N |                                |                                |
  T |                                |                                |
  --|--------------------------------|--------------------------------|--
  "
  ```


## Requirements

* Implement all modules described in a specification.

* Implement the *main.py* module and fulfill its specification.

* You are allowed to implement your own custom methods and classes. Remember about clean code.

* All fields in classes specified below should be `private`. Use getters/setters to access fields.

* All methods specified below should be `public` and your helper methods should be `private`.

* All tests must pass.

* Please don't change a file *todo_items_read_test.csv*! It's important for passing tests.

* Your program should fulfill cases described in the user story.

* Program should be based on the Object Oriented Programming paradigm

* Remember about proper constructors - not all attributes object are assigned by a parameter!

* Plan your task in Eisenhower matrix. First of all focus on the implement required class (and its instance methods). Then think about usefulness.

* Please fill up specification in this file if you implemented more functions. Use markdown syntaxes.


## The specification

### `Main.java`
TODO

### `TodoItem.java`

This is the file containing a todoItem logic.

### Class TodoItem

__Attributes__

* `title`
  - data: String
  - description: title of todoItem

* `deadline`
  - data: LocalDate object
  - description: deadline of todoItem, year is always set to *2018*

* `isDone`
  - data: boolean
  - description: contains true if TODO item is done, otherwise contains false.  Default value is false

__Instance methods__

* ##### `TodoItem(String title, LocalDate deadline)`

  Constructs a ToDoItem object

* `getTitle()`

  Getter for the * title * field

* `getDeadline()`

  Getter for the * deadline * field

* `mark()`

  Sets the object's * isDone * attribute to True

* `unmark()`

  Sets the object's * isDone * attribute to False

* `toString()`

  Returns a formatted string with details about todoItem.
  Format of deadline is 'day-month'

  Expecting output for example done item:

  `[x] 12-6 submit assignment`

  Expecting output for example undone item:

  `[ ] 28-6 submit assignment`

### `TodoQuarter.java`

This is the file containing a logic of an Eisenhower todo_quarter.

### Class TodoQuarter

__Instance Attributes__

* `todoItems`
  - data: List
  - description: list of TodoItem objects

__Instance methods__

* ##### `TodoQuarter()`

  Constructs a *TodoQuarter* object with list of TodoItem objects

* `addItem(String title, LocalDate deadline)`

  Append *TodoItem* object to *todoItems* sorted decreasing by *deadline*.

* `removeItem(int index)`

  Removes *TodoItem* object using *index* of list *todoItems*

* `archiveItems()`

  Removes all *TodoItem* objects with a parameter *isDone* set to *true* from list *todoItems*.

* `getItem(int index)`

  Returns *TodoItem* object from *index* of list *todoItems*.

* `getItems()`

  Returns private field *todoItems*.

* `toString()`

  Returns a formatted list of *todoItems* sorted decreasing by *deadline*. There is an expecting output:

  ```1. [ ] 9-6  go to the doctor
   2. [x] 11-6 submit assignment```


### `TodoMatrix.java`
### Class TodoMatrix

This is the file containing the logic of an Eisenhower todoMatrix.

__Attributes__

* `todoQuarters`

  - data: Map
  - description: contains *TodoQuarter* objects

    key: String - status of todoQuarter, value: TodoQuarter object

        possible keys of TODO quarter:
        - 'IU' means that todoQuarter contains important todoItems & urgent
        - 'IN' means that todoQuarter contains important todoItems & not urgent
        - 'NU' means that todoQuarter contains not important todoItems & urgent
        - 'NN' means that todoQuarter contains not important & not urgent todoItems


__Instance methods__

* ##### `TodoMatrix()`

  Constructs a *TodoMatrix* object with map of all possible quarters

* `getQuarters()`
  
  Returns a private filed *todoQuarters*.

* `getQuarter(String status)`

  Returns a chosen *TodoQuarter* object from a map *todoQuarters*.
  Status should be one of the possible statuses ('IU', 'IN', 'NU', 'NN').

* `addItem(String title, LocalDate deadline, boolean isImportant)`

  Adds new item to map *todoQuarters* using adequate key. You should use method *addItem* from *TodoQuarter* class.

  This method should be overloaded so as to accept two parameters only. In that case, isImportant should be `false` by default.

* `addItemsFromFile(String fileName)`

  Reads data from *fileName.csv* file and appends *TodoItem* objects to attributes *todoItems* in the properly *TodoQuarter* objects.
  Every item is written in a separate line the following format:

  `title|day-month|is_important`

  If *isImportant* is equal to false then last element is an empty string. Otherwise the last element is an arbitrary string.
  If the last element of line is an empty string, *isImportant* is equal to false - it means that the item should be assigned to a not important TODO quarter. Otherwise item should be assign to an important TODO quarter.

* `saveItemsToFile(String fileName)`

  Writes all details about TODO items to *fileName.csv* file
  Every item is written in a separate line the following format:

  `title|day-month|is_important`

  If *isImportant* contains false then the last element of line should be an empty string. Otherwise last element is an arbitrary string.

* `archiveItems()`

  Removes all *TodoItem* objects with a parameter *isDone* set to *true* from list *todoItems* in every element of dictionary *todoQuarters*

* `toString()`

  Returns a todoQuarters list (an Eisenhower todoMatrix) formatted to string.


## Running tests
You will need to download jar file from: https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone
You can try with the latest version. Put this file to `lib` directory in your project and then you will be able to run the test suite,
e.g. (adjust for your version number):

`java -jar lib/junit-platform-console-standalone-1.1.0-M1.jar -cp . --scan-classpath`

Of course, you need to compile the *Tests.java files first. This will handle _all_ java source files:
`javac -cp lib/\*:. *.java`
