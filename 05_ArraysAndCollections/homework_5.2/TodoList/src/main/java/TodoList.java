import java.util.ArrayList;

public class TodoList {

    private final ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todoList.size(), todo);
        System.out.println("Добавлено!");
    }

    public void add(int index, String todo) {
        if (index < todoList.size() && index >= 0) {
            todoList.add(index, todo);
            System.out.println("Добавлено!");
        } else {
            System.out.println("Ошибка!");
        }
    }

    public void edit(String todo, int index) {
        if (index < todoList.size()) {
            todoList.set(index, todo);
            System.out.println("Дело изменено!");
        } else {
            System.out.println("Ошибка!");
        }
    }

    public void delete(int index) {
        if (index < todoList.size() && index >= 0) {
            todoList.remove(index);
        } else {
            System.out.println("Ошибка!");
        }
    }

    public void list() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
    }

    public void help() {
        System.out.println("Доступные команды:" + System.lineSeparator() +
                "\tLIST - выводит весь список задач в консоль" + System.lineSeparator() +
                "\tADD *название задачи* - добавляет задачу в конец списка" + System.lineSeparator() +
                "\tADD *номер задачи и название новой задачи* - добавляет задачу в список на место заданного номера" + System.lineSeparator() +
                "\tEDIT *номер задачи в списке и название новой задачи* - изменяет задачу под заданным номером" + System.lineSeparator() +
                "\tDELETE *номер задачи в списке* - удаляет задачу под заданным номером");
    }

    public void error() {
        System.out.println("Введите команду из списка. Чтобы отобразить список доступных команд введите HELP");
    }

    public ArrayList<String> getTodos() {
        return todoList;
    }
}