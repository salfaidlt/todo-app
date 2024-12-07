package bf.isge.gsn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoServiceImplem implements TodoService {
    private List<Todo> todoList = new ArrayList<>();

    @Override
    public void createTodo(int id, String description) {
        Todo todo = new Todo(id, description, LocalDate.now());
        todoList.add(todo);
        System.out.println("The todo has been successfully created : " + todo);
    }

    @Override
    public Todo searchTodoById(int id) {
        for ( Todo todoItem : todoList) {
            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }

    @Override
    public void deleteTodoById(int id) {
        int index = -1;
        for ( Todo todoItem : todoList) {
            index++;
            if (todoItem.getId() == id) {
                todoList.remove(index);
                break;
            }
        }
    }

    @Override
    public List<Todo> listOfTodo() {
        return this.todoList;
    }
}
