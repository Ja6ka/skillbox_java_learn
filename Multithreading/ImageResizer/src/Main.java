import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int CORES_COUNT = 12;

    public static void main(String[] args) {
        String srcFolder = "C:\\java_basics\\Multithreading\\ImageResizer\\lib\\srcPicLib";
        String dstFolder = "C:\\java_basics\\Multithreading\\ImageResizer\\lib\\dstPicLib";

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();

        File[] files = srcDir.listFiles();
        List<File[]> filesByCores = new ArrayList<>()
        {{
            for (int i = 0; i < CORES_COUNT; i++)
            {
                add(new File[Math.round(files.length / CORES_COUNT) + 1]);
            }
        }};

        int currentElementIndex = 0;
        int currentArrayIndex = 0;

        assert files != null;
        for (File file : files)
        {
            if (currentArrayIndex == filesByCores.size())
            {
                currentArrayIndex = 0;
                currentElementIndex++;
            }
            filesByCores.get(currentArrayIndex)[currentElementIndex] = file;
            currentArrayIndex++;
        }

        filesByCores.forEach(arr ->
        {
            ImageResizer resizer = new ImageResizer(arr, dstFolder);
            Thread thread = new Thread(resizer);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }
}
