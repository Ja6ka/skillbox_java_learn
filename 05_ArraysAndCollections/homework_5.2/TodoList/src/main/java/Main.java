import java.util.Scanner;

public class Main {

    private static final TodoList todoList = new TodoList();
    private static final String LIST = "\\s*LIST\\s*";
    private static final String ADD = "\\s*ADD\\s+[\\p{Alpha}\\s]+";
    private static final String ADD_NUMBER = "\\s*ADD\\s+\\d+.+";
    private static final String EDIT = "\\s*EDIT\\s+\\d+.+";
    private static final String DELETE = "\\s*DELETE\\s+\\d+";
    private static final String HELP = "\\s*HELP\\s*";

    public static void main(String[] args) {
        while (true) {
            System.out.println("Добро пожаловать в список задач!");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputByWords = input.split("\\s+");

            if (input.matches(LIST)) {
                todoList.list();
            } else if (input.matches(ADD)) {
                todoList.add(input.substring(input.indexOf(inputByWords[1])).trim());
            } else if (input.matches(ADD_NUMBER)) {
                todoList.add(Integer.parseInt(inputByWords[1]), input.substring(input.indexOf(inputByWords[2])).trim());
            } else if (input.matches(EDIT)) {
                todoList.edit(input.substring(input.indexOf(inputByWords[2])).trim(), Integer.parseInt(inputByWords[1].trim()));
            } else if (input.matches(DELETE)) {
                todoList.delete(Integer.parseInt(inputByWords[1].trim()));
            } else if (input.matches(HELP)) {
                todoList.help();
            } else {
                todoList.error();
            }
        }
    }
}
