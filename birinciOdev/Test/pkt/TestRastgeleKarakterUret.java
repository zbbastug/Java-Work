/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* karakteruretmetesti
* </p>
*/

package pkt;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestRastgeleKarakterUret {

	static RastgeleKarakterUret rku;
	
	@BeforeAll
	public static void setup() 
	{
		rku=new RastgeleKarakterUret();
		IRastgeleKarakterUret irku=mock(IRastgeleKarakterUret.class);
		when(irku.RastgeleKarakter()).thenReturn('a');
		
	}
	
	@DisplayName("Mock Testi")
	@Test
	void MockTest() 
	{
		assertFalse(rku.RastgeleKarakter()==' ');
	}
	
	@DisplayName("Uretilen Karakter Testi")
	@Test
	void UretilenKarakterliMiTest() 
	{
		assertTrue(Character.isLetter(rku.RastgeleKarakter()));
	}
	
	@DisplayName("Uretilen Harf Mi Testi")
	@Test
	void HarfTest() 
	{
		char uretilen=rku.RastgeleKarakter();
		assertTrue((uretilen>=65 && uretilen<=90) || (uretilen>=97 && uretilen<=122));
	}
	
	@DisplayName("Buyuk Harf Testi")
	@Test
	void BuyukHarfTest() 
	{
		char uretilen=rku.BuyukKarakter();
		assertTrue((uretilen>=65 && uretilen<=90));
		
	}
	@DisplayName("Kucuk Harf Testi")
	@Test
	void KucukHarfTest() 
	{
		
		char uretilen=rku.KucukKarakter();
		assertTrue((uretilen>=97 && uretilen<=122));
		
	}
	
	
}
