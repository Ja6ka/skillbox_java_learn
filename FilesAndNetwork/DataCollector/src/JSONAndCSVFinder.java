import java.io.File;

public class JSONAndCSVFinder {
    public static void searchForCSVAndJSONFiles(String folderPath) {
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchForCSVAndJSONFiles(file.getAbsolutePath());
                    } else {
                        String fileName = file.getName();
                        if (fileName.endsWith(".json")) {
                            System.out.println("Найден JSON-файл: " + fileName);
                        } else if (fileName.endsWith(".csv")) {
                            System.out.println("Найден CSV-файл: " + fileName);
                        }
                    }
                }
            }
        } else {
            System.out.println("Папка не существует или указанный путь не является папкой.");
        }
    }
}
