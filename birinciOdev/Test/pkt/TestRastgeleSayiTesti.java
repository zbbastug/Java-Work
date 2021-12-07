/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* rastgeelesayitesti
* </p>
*/
package pkt;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestRastgeleSayiTesti {

	RandomSayi rs= new RandomSayi();
	
	
	
	@DisplayName("Sayi Uretim Testi")
	@Test
	void sayiUretimTesti() 
	{
		boolean kontrol = false;
		int deneme = rs.RastgeleSayiUret();
		
		 if (deneme== (int)deneme)
		        {
		          kontrol=true;
		        }

		        assertTrue(kontrol);
	}
	
	

}
