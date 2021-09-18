import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileUtils {

    public static long calculateFolderSize(String path) {
        Path file = Paths.get(path);
        final long[] fileSize = {0};
        try {
            Files.walkFileTree(file, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    fileSize[0] += Files.size(file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException e) throws IOException {
                    System.err.printf("Visiting failed, skip: %9s (???) bytes\t- %s\n", Files.size(file), file);
                    return FileVisitResult.SKIP_SUBTREE;
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return fileSize[0];
    }

    public static String isFolder(String path) {
        String type;
        Path file = Paths.get(path);
        if (Files.isDirectory(file)) {
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
