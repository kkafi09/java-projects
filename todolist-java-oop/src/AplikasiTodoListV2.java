import Repository.TodoListRepository;
import Repository.TodoListRepositoryimpl;
import Service.TodoListService;
import Service.TodoListServiceimpl;
import View.TodoListView;

public class AplikasiTodoListV2 {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryimpl();
        TodoListService todoListService = new TodoListServiceimpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
