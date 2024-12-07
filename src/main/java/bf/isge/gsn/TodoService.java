package bf.isge.gsn;

import java.util.List;

public interface TodoService {

    // create todo
    public void createTodo(int id, String description);

    // search todo by id
    public Todo searchTodoById(int id);

    // delete todo by id
    public void deleteTodoById(int id);

    // get list of todo
    public List<Todo> listOfTodo();
}
