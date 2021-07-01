package View;

import Service.TodoListService;
import util.inputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList(){
        while(true){
            todoListService.showTodoList();
            System.out.println("Menu :");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = inputUtil.input("Pilih ");

            if (input.equals("1")){
                addTodoList();
            } else if(input.equals("2")){
                removeTodoList();
            } else if (input.equals("x")){
                break;
            } else{
                System.out.println("Perintah tidak dimengerti");
            }
        }
    }

    public void addTodoList(){
        System.out.println("Menambah TodoList");

        var todo = inputUtil.input("Todo ");
        if (todo.equals("x")){
            //batal
        } else {
            todoListService.addTodoList(todo);
        }
    }

    public void removeTodoList(){
        System.out.println("Menghapus TodoList");
        var number = inputUtil.input("Number ");
        if (number.equals("x")){
            //batal
        } else {
            todoListService.removeTodoList(Integer.valueOf(number));
        }
    }
}
