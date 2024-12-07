package bf.isge.gsn;

import java.time.LocalDate;
import java.util.*;

public class TodoServiceMapImplem implements TodoService {

    private Map<Integer, Todo> todoMap = new HashMap<>();
    @Override
    public void createTodo(int id, String description) {
        Todo todo = new Todo(id, description, LocalDate.now());
        todoMap.put(id, todo);
        System.out.println("The todo has been successfully created : " + todo);
    }

    @Override
    public Todo searchTodoById(int id) {
        return todoMap.get(id);
    }

    @Override
    public void deleteTodoById(int id) {
        todoMap.remove(id);
    }

    @Override
    public List<Todo> listOfTodo() {
        return new ArrayList<>(todoMap.values());
    }
}
