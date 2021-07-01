public class TodoListDasar {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static String[] model = new String[10];

    public static void main(String[] args) {
        viewShowTodoList();
    }

    public static void showTodoList(){
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var num = i + 1;

            if (todo != null){
                System.out.println(num + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java dasar";
        model[1] = "Belajar Java OOP";

        showTodoList();
    }

    public static void addTodoList(String todo){
        var isFull = true;
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++){
                temp[i] = model[i];
            }
        }

        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        addTodoList("Belajar Javascript Dasar");
        addTodoList("Belajar Javascript OOP");
        addTodoList("Belajar PHP");

        showTodoList();
    }

    public static boolean removeTodoList(Integer number){
        if((number - 1) >= model.length){
            return false;
        } else if(model[number - 1] == null){
            return false;
        } else{
            for (var i = (number - 1); i < model.length; i++){
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else{
                    model[i] = model[i + 1];
                }
            }
        }
        return true;
    }

    public static void testremoveTodoList(){
        model[0] = "Belajar Java dasar";
        model[1] = "Belajar Java OOP";
        model[2] = "Belajar JavaScript dasar";
        model[3] = "Belajar JavaScript OOP";

        removeTodoList(3);

        showTodoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void viewShowTodoList(){
        while(true){
            System.out.println("TODOLIST");
            showTodoList();
            System.out.println("Menu :");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih ");

            if (input.equals("1")){
                viewAddTodoList();
            } else if(input.equals("2")){
                viewRemoveTodoList();
            } else if (input.equals("x")){
                break;
            } else{
                System.out.println("Perintah tidak dimengerti");
            }
        }
    }

    public static void viewAddTodoList(){
        System.out.println("Menambah TodoList");

        var todo = input("Todo ");
        if (todo.equals("x")){
            //batal
        } else {
            addTodoList(todo);
        }
    }

    public static void viewRemoveTodoList(){
        System.out.println("Menghapus TodoList");
        var number = input("Number ");
        if (number.equals("x")){
            //batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success){
                System.out.println("gagal menghapus todolist : " + number);
            }
        }
    }
}

