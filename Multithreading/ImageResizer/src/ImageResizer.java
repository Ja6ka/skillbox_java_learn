import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageResizer implements Runnable {
    private File[] files;
    private String dstFolder;

    public ImageResizer(File[] files, String dstFolder) {
        this.files = files;
        this.dstFolder = dstFolder;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        try {
            for (File file : files) {
                if (file == null) {
                    continue;
                }
                BufferedImage image = ImageIO.read(file);
                if (image == null) {
                    continue;
                }

                int newWidth = 300;
                int newHeight = (int) Math.round(
                        image.getHeight() / (image.getWidth() / (double) newWidth)
                );

                BufferedImage newImage = Scalr.resize(image, newWidth, newHeight);

                File newFile = new File(dstFolder + "/" + file.getName());
                ImageIO.write(newImage, "jpg", newFile);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Duration:" + (System.currentTimeMillis() - start) + "ms");
    }
}
