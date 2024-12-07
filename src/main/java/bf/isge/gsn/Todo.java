package bf.isge.gsn;

import java.time.LocalDate;
import java.util.Objects;

public class Todo {
    private int id;
    private String description;
    private LocalDate date;

    public Todo(int id, String description, LocalDate now) {
        this.id = id;
        this.description = description;
        this.date = now;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id && Objects.equals(description, todo.description) && Objects.equals(date, todo.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, date);
    }


}
