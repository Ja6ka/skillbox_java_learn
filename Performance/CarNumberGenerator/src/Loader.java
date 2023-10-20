import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Loader {

    public static void main(String[] args) throws Exception {
        int threadNumber = Runtime.getRuntime().availableProcessors();
        int regionCount = 199;
        int regionPartsCount = regionCount / threadNumber;

        ExecutorService executorService = Executors.newFixedThreadPool(threadNumber);
        int start;
        int end = 1;
        for (int i = 1; i <= threadNumber; i++) {
            start = end;
            if (i == threadNumber) {
                end = regionCount + 1;
            } else {
                end = start + regionPartsCount;
            }
            int finalStart = start;
            int finalEnd = end;
            executorService.execute(() -> {
                try {
                    generate(finalStart, finalEnd);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
    }

    private static void generate(int regionFrom, int regionTo) throws Exception {
        long start = System.currentTimeMillis();

        PrintWriter writer = new PrintWriter("res/numbers " + regionFrom + " - " + regionTo + ".txt");

        char[] letters = {'Ó', 'Ê', 'Å', 'Í', 'Õ', 'Â', 'À', 'Ð', 'Î', 'Ñ', 'Ì', 'Ò'};


        for (int regionCode = regionFrom; regionCode < regionTo; regionCode++) {

            StringBuilder regionString = new StringBuilder(regionCode);
            if (regionCode < 10) {
                regionString.insert(0, '0');
            }

            StringBuilder builder = new StringBuilder();
            for (int number = 1; number < 1000; number++) {

                StringBuilder numberString = new StringBuilder(number);
                if (number < 10) {
                    numberString.insert(0, "00");
                } else if (number < 100) {
                    numberString.insert(0, '0');
                }

                for (char firstLetter : letters) {
                    for (char secondLetter : letters) {
                        for (char thirdLetter : letters) {
                            builder.append(firstLetter).append(numberString).append(secondLetter)
                                    .append(thirdLetter).append(regionString).append('\n');
                        }
                    }
                }
            }
            writer.write(builder.toString());
        }
        writer.flush();
        writer.close();
        System.out.println((System.currentTimeMillis() - start) + " ms");
    }
}
