package bf.isge.gsn;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TodoService todoService = new TodoServiceMapImplem();
        todoService.createTodo(1, "This is a todo");
        todoService.createTodo(2, "This is another todo");

        // search by id
        System.out.println("Result : " + todoService.searchTodoById(2));

        // delete by id
        todoService.deleteTodoById(1);
        todoService.deleteTodoById(2);

        // list of all todo
        List<Todo> list = todoService.listOfTodo();
        System.out.println(list);

        // delete by id
        todoService.deleteTodoById(1);
    }
}
