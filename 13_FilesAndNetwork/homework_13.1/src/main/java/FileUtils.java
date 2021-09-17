import java.io.File;

public class FileUtils {

    public static long calculateFolderSize(String path) {
        long totalLength = 0;
        try {
            File file = new File(path);
            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    if (f.isDirectory()) {
                        totalLength += calculateFolderSize(f.getPath());
                    } else {
                        totalLength += f.length();
                    }
                }
            } else {
                totalLength = file.length();
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return totalLength;
    }

    public static String isFolder(String path) {
        String type;
        File file = new File(path);
        if (file.isDirectory()) {
            type = "папки";
        } else {
            type = "файла";
        }
        return type;
    }

    public static String convertFormat(long size) {
        String[] suffix = {" байт", " Кбайт", " Мбайт", " Гбайт", " Тбайт"};
        int index = 0;

        double temp = (double) size / 1024;

        while (temp >= 1) {
            temp = temp / 1024;
            index++;
        }

        if (index == 0) {
            return size + suffix[index];
        } else {
            return (Math.round(10 * size / (Math.pow(1024, (index)))) / 10.0) + suffix[index];
        }
    }
}
