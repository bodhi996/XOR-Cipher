// Java program to demonstrate colored to red colored image conversion
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java. util. Random;
public class Cipher
{
        static int XOR(int a, int b)
        {
            return (a|b) & (~a|~b);
        }
	public static void main(String args[])throws IOException
	{
		BufferedImage img = null;
		File f = null;

		// read image
		try
		{
			f = new File("C:\\Users\\BODHISATWA\\Desktop\\Encrypt.jpg");
			img = ImageIO.read(f);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		// get width and height
		int width = img.getWidth();
		int height = img.getHeight();

		// convert to red image
		for (int y = 0; y < height; y++)
		{
			for (int x = 0; x < width; x++)
			{
				int p = img.getRGB(x,y);

				int a = (p>>24)&0xff;
				int r = (p>>16)&0xff;
				//System.out.println(p);
				Random ran = new Random();
                                int low = 10;
                                int high = 255255255;
                                int result = ran.nextInt(high-low) + low;

				// set new RGB
				// keeping the r value same as in original
				// image and setting g and b as 0.
				p = (a<<24) | (r<<16) | (0<<8) | 0;
				p=XOR(p,73431834);

				img.setRGB(x, y, p);
			}
		}

		// write image
		try
		{
			f = new File("C:\\Users\\BODHISATWA\\Desktop\\Out.jpg");
			ImageIO.write(img, "jpg", f);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
