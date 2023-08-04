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

            System.out.println("��������� JSON-�����:");
            for (String jsonFile : jsonFiles) {
                System.out.println(jsonFile);
            }

            System.out.println("��������� CSV-�����:");
            for (String csvFile : csvFiles) {
                System.out.println(csvFile);
            }
        } else {
            System.out.println("����� �� ���������� ��� ��������� ���� �� �������� ������.");
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
                    searchFilesRecursively(file, jsonFiles, csvFiles); // ����������� ����� ��� ������ ��������� �����
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
