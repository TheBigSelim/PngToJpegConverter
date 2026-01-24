package main.java;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage input = ImageIO.read(new File("src/main/resources/input.png"));
        BufferedImage image = new BufferedImage(input.getWidth(), input.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < input.getWidth(); x++) {
            for (int y = 0; y < input.getHeight(); y++) {
                int pixel = input.getRGB(x,y);
                int rgb = pixel & (0x00FFFFFF);
                image.setRGB(x,y,rgb);
            }
        }
        File output = new File("src/main/resources/output.jpeg");
        ImageIO.write(image, "jpeg", output);

    }
}