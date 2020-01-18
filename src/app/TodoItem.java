package app;

import java.time.LocalDate;

public class TodoItem {
    private String title;
    private LocalDate deadline;
    private boolean isDone;

    public TodoItem(String title, LocalDate deadline) {
        this.title = title;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void mark() {
        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public String toString() {
        if (isDone) {
            return "[x] " + deadline.toString().substring(5) + " " + title;
        } else {
            return "[] " + deadline.toString().substring(5) + " " + title;
        }
    }
}