package aspectRatio;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Reto6 {
    public static void main(String[] args) {

        String imageURL = "https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png";
        try {
            BufferedImage image = ImageIO.read(new URL(imageURL));
            if(image!=null){
                int width = image.getWidth();
                int height = image.getHeight();
                String aspectRatio = calculateAspectRatio(width, height);
            }
        }catch (IOException e){
            System.out.println("Error reading the image from the URL: " + e.getMessage());
        }
    }

    private static String calculateAspectRatio(int width, int height) {
        int gcd = findGCD(width,height);
        int aspectWidth = width/gcd;
        int aspectHeight = height/gcd;
        String s = aspectWidth + ":" + aspectHeight;
        return s; 
    }

    private static int findGCD(int a, int b) {
        while(b!=0){
            int temp = b;
            b= a%b;
            a=temp;
        }
        return a;
    }


}
