/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* coklukarakterolusturmatesti
* </p>
*/
package pkt;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;

class TestCokluKarakterOlusturma {

	static CokluKarakterOlusturma cko;
	
	@BeforeAll
	public static void setup()
	{
		cko= new CokluKarakterOlusturma();
		ICokluKarakterOlusturma icko = mock(ICokluKarakterOlusturma.class);
		when(icko.CokluKarakterOlusturma(3)).thenReturn("dgr");
	}
	
	@DisplayName("Mock Testi")
	@Test
	void testMock() 
	{
		assertEquals(3,cko.CokluKarakterOlusturma(3).length());
	}
	
	@DisplayName("0 Testi")
	@Test
	void testSifir()
	{
		assertThrows(IllegalArgumentException.class,()->{cko.CokluKarakterOlusturma(0);});
	}
	
	@DisplayName("1 Testi")
	@Test
	void testBir()
	{
		assertThrows(IllegalArgumentException.class,()->{cko.CokluKarakterOlusturma(1);});
	}
	
	@DisplayName("Karakter Uretiyor Mu?")
	@Test
	void testKarakterUretme()
	{
		boolean kontrol=true;
		Faker faker=new Faker();
		int sayi=faker.number().randomDigitNotZero();
		char[] uretilen=cko.CokluKarakterOlusturma(sayi).toCharArray();
		for(int i=0; i<uretilen.length;i++)
		{
	
			if(!(Character.isLetter(uretilen[i])))
			{kontrol=false;}
			else
				kontrol=true;
			
		}
		assertTrue(kontrol);
		
	}
	
	@DisplayName("Rastgele istenilen sayýda  Uretiyor Mu?")
	@Test
	void testIstenilenSayidaKarakterUretme()
	{
		
		Faker faker=new Faker();
		int sayi;
		
		do {
			sayi=faker.number().randomDigitNotZero();
			
		}while(sayi==1);
		
		assertEquals(sayi, cko.CokluKarakterOlusturma(sayi).length());
		
	}
	
	
	

}
