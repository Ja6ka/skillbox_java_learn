import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JSONAndCSVFinder {
    public static List<String> searchForCSVAndJSONFiles(String folderPath) {
        File folder = new File(folderPath);
        ArrayList<String> jsonFiles = new ArrayList<>();
        ArrayList<String> csvFiles = new ArrayList<>();
        ArrayList<String> allFiles = new ArrayList<>();
        if (folder.exists() && folder.isDirectory()) {

            searchFilesRecursively(folder, jsonFiles, csvFiles);

            System.out.println("Найденные JSON-файлы:");
            for (String jsonFile : jsonFiles) {
                System.out.println(jsonFile);
            }

            System.out.println("Найденные CSV-файлы:");
            for (String csvFile : csvFiles) {
                System.out.println(csvFile);
            }
        } else {
            System.out.println("Папка не существует или указанный путь не является папкой.");
        }
        allFiles.addAll(csvFiles);
        allFiles.addAll(jsonFiles);
        return allFiles;
    }

    public static void searchFilesRecursively(File folder, ArrayList<String> jsonFiles, ArrayList<String> csvFiles) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    searchFilesRecursively(file, jsonFiles, csvFiles); // Рекурсивный вызов для обхода вложенных папок
                } else {
                    String fileName = file.getName();
                    if (fileName.endsWith(".json")) {
                        jsonFiles.add(file.getAbsolutePath());
                    } else if (fileName.endsWith(".csv")) {
                        csvFiles.add(file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
