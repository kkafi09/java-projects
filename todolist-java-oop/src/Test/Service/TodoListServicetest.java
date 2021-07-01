package Test.Service;

import Repository.TodoListRepository;
import Repository.TodoListRepositoryimpl;
import Service.TodoListService;
import Service.TodoListServiceimpl;

public class TodoListServicetest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryimpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryimpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);

        todoListService.addTodoList("Belajar Java dasar");
        todoListService.addTodoList("Belajar Java OOP");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryimpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);

        todoListService.addTodoList("Belajar Java dasar");
        todoListService.addTodoList("Belajar Java OOP");

        todoListService.showTodoList();

        todoListService.removeTodoList(2);
        todoListService.showTodoList();
    }
}
