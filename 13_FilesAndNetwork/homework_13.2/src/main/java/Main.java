import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите путь к папке или файлу, откуда необходимо провести копирование: ");
            String startFolder = scanner.nextLine().replace('\\', File.separatorChar);

            System.out.println("Введите путь к точке назначения: ");
            String destFolder = scanner.nextLine().replace('\\', File.separatorChar);

            FileUtils.copyFolder(startFolder, destFolder);
        }
    }
}
