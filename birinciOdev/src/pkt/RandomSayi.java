/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* randomkodu
* </p>
*/
package pkt;

import java.util.Random;

public class RandomSayi {
	
	public int RastgeleSayiUret() {
		
		Random rnd=new Random();
		return rnd.nextInt(123);
	}
}
