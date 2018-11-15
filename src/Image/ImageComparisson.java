package Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Catalano.Imaging.FastBitmap;
import Catalano.Imaging.Tools.ObjectiveFidelity;

public class ImageComparisson {

	public static void main(String[] args) {  
		try {
			 
			 
			BufferedImage img1 = ImageIO.read(new File("DS/Images/Test.png"));;
			BufferedImage img2 = ImageIO.read(new File("My data/DS/Images/C360_2016-06-11-11-25-43-897.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FastBitmap original = new FastBitmap("/DS/Images/C360_2016-06-11-11-25-26-404.jpg");
		//FastBitmap reconstructed = new FastBitmap("/DS/Images/C360_2016-06-11-11-25-43-897.jpg");

		/*ObjectiveFidelity o = new ObjectiveFidelity(original, reconstructed);

		// Error total
		int error = o.getTotalError();

		//Mean Square Error
		double mse = o.getMSE();

		//Signal Noise Ratio
		double snr = o.getSNR();

		//Peak Signal Noise Ratio
		double psnr = o.getPSNR();
		
		System.out.println(" error = "+error);
		System.out.println(" snr = "+snr);

		System.out.println(" psnr = "+psnr);
*/
	}
}	

