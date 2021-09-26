import java.io.File;
import java.nio.file.*;

public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) {
        File startFolder = new File(sourceDirectory);
        File destFolder = new File(destinationDirectory);

        try {
            if (startFolder.isDirectory()) {
                if (!destFolder.exists()) {
                    Files.createDirectory(destFolder.toPath());
                    for (File f : startFolder.listFiles()) {
                        Files.copy(f.toPath(), destFolder.toPath().resolve(f.getName()), StandardCopyOption.REPLACE_EXISTING);
                        copyFolder(f.toString(), destFolder.toString());
                    }
                }
            } else {
                Files.copy(startFolder.toPath(), destFolder.toPath().resolve(startFolder.getName()), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}