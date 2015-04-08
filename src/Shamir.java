import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.math.*;
import java.awt.image.*;
import java.awt.*;
import java.io.*;
import javax.swing.JFrame;


/**
 * @author rutu
 *
 */
public class Shamir {

	BufferedImage  image;
	   int width;
	   int height;
	public static void main(String[] args) throws IOException{
		
       // int width= 512;
       // int height= 664;
        int depth= 24;
        Shamir obj = new Shamir();
        int exponent = depth;
        //BufferedImage image= null;
        //File f = null;
        BigInteger bi1,bi2;
        bi1 = new BigInteger("2");
        bi2 = bi1.pow(exponent);
        String str = "Result is " + bi1 + "^" +exponent+ " = " +bi2;
        System.out.println( str );
        int threshold =(int) (Math.log(bi2.doubleValue()) / Math.log(255));
        System.out.println("The threshold value for k is = "+threshold);
        int k;
        k = threshold+1;
        System.out.println("Value of K in (K,n)sharing scheme is = "+k);
        //read image file
        //try {
        	//f = new File ("C:\\Users\\lap\\Desktop\\1.JPG");
        	//image = new BufferedImage (width,height,BufferedImage.TYPE_INT_ARGB);
        	//image= ImageIO.read(f);
        	//System.out.println("reading complete");
        	
        	
        	
        //}catch (IOException e){
        	//System.out.println("Error :"+e);
        	
        //}
        
      //write image 
      //  try {
        //	f = new File ("C:\\Users\\lap\\Desktop\\output.JPG");
        	//ImageIO.write(image,"jpg",f);
        	//System.out.println("writing complete");
        	
        	
       // }catch (IOException e){
        //	System.out.println("Error :"+e);
        	
        //}
		
	} // main() ends here

	 public Shamir() {
		   
	      try {
	         File input = new File("C:\\Users\\lap\\Desktop\\1.JPG");
	         image = ImageIO.read(input);
	         width = image.getWidth();
	         height = image.getHeight();
	         
	         for(int i=0; i<height; i++){
	         
	            for(int j=0; j<width; j++){
	            
	               Color c = new Color(image.getRGB(j, i));
	               int red = (int)(c.getRed() * 0.299);
	               int green = (int)(c.getGreen() * 0.587);
	               int blue = (int)(c.getBlue() *0.114);
	               Color newColor = new Color(red+green+blue,
	               
	               red+green+blue,red+green+blue);
	               
	               image.setRGB(j,i,newColor.getRGB());
	            }
	         }
	         
	         File ouptut = new File("C:\\Users\\lap\\Desktop\\grayscale.jpg");
	         ImageIO.write(image, "jpg", ouptut);
	         
	      } catch (Exception e) {}
	   }
}// class ends here
