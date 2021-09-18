import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (; ; ) {
            long size;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите путь к папке или файлу: ");
            String input = scanner.nextLine().replace('\\', File.separatorChar);

            size = FileUtils.calculateFolderSize(input);
            System.out.println("Размер " + FileUtils.isFolder(input) + ": " + FileUtils.convertFormat(size));
        }
    }
}
