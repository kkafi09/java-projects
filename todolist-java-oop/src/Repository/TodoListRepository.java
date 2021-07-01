package Repository;

import Entity.Todolist;

public interface TodoListRepository {

    Todolist[] getAll();

    void add(Todolist todolist);

    boolean remove(Integer number);
}
