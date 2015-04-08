

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

import javax.imageio.ImageIO;

import java.awt.color.ColorSpace;
import java.awt.image.ColorConvertOp;


public class GetPixelColor {

    //int y, x, tofind, col;
    /**
     * @param args the command line arguments
     * @throws IOException  
     */
    public static void main(String args[]) throws IOException {
        try {
            //read image file
        	GetPixelColor imageGrayer = new GetPixelColor();
            File file1 = new File("C:\\Users\\lap\\Desktop\\grayscale.JPG");
            BufferedImage image1 = ImageIO.read(file1);

            //write file
            FileWriter fstream = new FileWriter("C:\\Users\\lap\\Desktop\\pixels.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            
           // BufferedImage img;//////read the image
            //int rgb = img.getRGB(x, y);
            //int r = (rgb >> 16) & 0xFF;
            //int g = (rgb >> 8) & 0xFF;
            //int b = (rgb & 0xFF);
            //color object
            //Color cyan = new Color(0, 255, 255);
        
    //        BufferedImage out = imageGrayer.grayOut("C:\\Users\\lap\\Desktop\\grayscale.JPG");
            //find cyan pixels
            for (int x = 0; x < image1.getHeight(); x++) {
                for (int y = 0; y < image1.getWidth(); y++) {
                	
                	

                  int c =image1.getRGB(y,x)& 0xFF;;
                  BigInteger bi = new BigInteger(Integer.toString(c));
                 
                 
               
                 // int cm = c % 255 ;
                  System.out.println("pixel value = "+c);
                 // Color color = new Color(c);
                //  int red = color.getRed();
                  //int blue = color.getBlue();
                 // int green = color.getGreen();
                 // int  red = (c & 0x0000FFFF) >> 16;
                  //int  green = (c & 0x0000FFFF) >> 8;
                  //int  blue = c & 0x0000FFFF;

                   //if (cyan.equals(image1.getRGB(x, y)){

                 
                        out.write("pixel found at=" + x +" " + "," + y +" "+ "is = "+" " +c );
                        out.newLine();
                	}
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage grayOut(BufferedImage img) {
        ColorConvertOp colorConvert = new ColorConvertOp(ColorSpace
                .getInstance(ColorSpace.CS_GRAY), null);
        colorConvert.filter(img, img);
 
        return img;
    }

	
}
