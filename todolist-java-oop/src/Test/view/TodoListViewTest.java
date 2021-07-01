package Test.view;

import Repository.TodoListRepository;
import Repository.TodoListRepositoryimpl;
import Service.TodoListService;
import Service.TodoListServiceimpl;
import View.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args){
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryimpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar java dasar");
        todoListService.addTodoList("Belajar java OOP");
        todoListService.addTodoList("Belajar javascipt");

        todoListView.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryimpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListView.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryimpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar java dasar");
        todoListService.addTodoList("Belajar java OOP");
        todoListService.addTodoList("Belajar javascipt");

        todoListView.showTodoList();
        todoListView.removeTodoList();
        todoListView.showTodoList();
    }

}
