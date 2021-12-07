/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* cumletesti
* </p>
*/
package pkt;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCumleOlustur {

	static CumleOlusturma colustur;
	@BeforeAll
	public static void setup()
	{
		colustur=new CumleOlusturma();
		
		ICumleOlustur colustur=mock(ICumleOlustur.class);
		when(colustur.CumleOlustur()).thenReturn("a");
		
	}
	
	@DisplayName("Mock Testi")
	@Test
	void MockTest() 
	{
		assertFalse(colustur.CumleOlustur()==" ");
	}
	
	@DisplayName("Cumle Harflerden mi Olusuyor?")
	@Test
	void CumleHarfliMiTesti()
	{
		char[] deneme = colustur.CumleOlustur().toCharArray();
		boolean kontrol=false;
		for(int i=0; i<deneme.length-1;i++)
		{
			if((deneme[i]>=65 && deneme[i]<=90)|| (deneme[i]>=97 && deneme[i]<=122) || deneme[i]==' ')
				{
					kontrol=true;
					}
				else
					kontrol=false;
	
		}
			assertTrue(kontrol);	
			
		}
	
	@DisplayName("Cumle Buyuk Harflerden mi Olusuyor?")
	@Test
	void BuyukCumleTesti()
	{
		char[] deneme = colustur.CumleOlustur().toCharArray();
		boolean kontrol=false;
		for(int i=0; i<deneme.length-1;i++)
		{
			if((deneme[i]>=65 && deneme[i]<=90) || deneme[i]==' ')
				{
					kontrol=true;
					}
				else
					kontrol=false;
	
		}
			assertTrue(kontrol);	
			
		}
	
	@DisplayName("Cumle Kucuk Harflerden mi Olusuyor?")
	@Test
	void KucukCumleTesti()
	{
		char[] deneme = colustur.CumleOlustur().toCharArray();
		boolean kontrol=false;
		for(int i=0; i<deneme.length-1;i++)
		{
			if((deneme[i]>=97 && deneme[i]<=122) || deneme[i]==' ')
				{
					kontrol=true;
					}
				else
					kontrol=false;
	
		}
			assertTrue(kontrol);	
			
		}
	
	@DisplayName("Nokta var mi?")
	@Test
	void NoktaTesti()
	{
		char[] deneme = colustur.CumleOlustur().toCharArray();
		boolean kontrol=false;
		
			if(deneme[deneme.length-1]=='.')
			{
				kontrol=true;
			}
				
		
			assertTrue(kontrol);	
			
		}
	
}
