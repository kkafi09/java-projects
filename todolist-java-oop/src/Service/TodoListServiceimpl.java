package Service;

import Entity.Todolist;
import Repository.TodoListRepository;

public class TodoListServiceimpl implements TodoListService{

    public TodoListRepository todoListRepository;

    public TodoListServiceimpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        Todolist[] model = todoListRepository.getAll();
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            var todolist = model[i];
            var num = i + 1;

            if (todolist != null){
                System.out.println(num + ". " + todolist.getTodo());
            }
        }
    }


    @Override
    public void addTodoList(String todo) {
        Todolist todolist = new Todolist(todo);
        todoListRepository.add(todolist);
        System.out.println("Sukses Menambah Todo : " + todo);

    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepository.remove(number);
        if (success){
            System.out.println("SUKSES MENGHAPUS : " + number);
        } else{
            System.out.println("GAGAL MENGHAPUS : " + number);
        }
    }
}


