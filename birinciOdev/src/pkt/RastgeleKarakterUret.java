/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* rastgelekarakteruretme
* </p>
*/
package pkt;

import java.util.Random;

public class RastgeleKarakterUret implements IRastgeleKarakterUret {

	RandomSayi rs;
	char karakter;
	
	public RastgeleKarakterUret()
	{
		rs=new RandomSayi();
		karakter=' ';
		
		
	}
	@Override
	public char RastgeleKarakter() {
		
		
		int degisken;
		do 
		{
	        degisken=(rs.RastgeleSayiUret());
	    }while(degisken<65 || (degisken>90 && degisken<97) || degisken>122);

		karakter = (char) degisken;
		return karakter;
		
	}

	@Override
	public char BuyukKarakter() {
		karakter=' ';
		do 
		{
			karakter=RastgeleKarakter();
			if(karakter>=65 && karakter<=90)
			{
				break;
			}
			
		}while(true);
		
		return karakter;
	}

	@Override
	public char KucukKarakter() {

		karakter=' ';
		do 
		{
			karakter=RastgeleKarakter();
			if(karakter>=97 && karakter<=122)
			{
				break;
			}
			
		}while(true);
		
		return karakter;
	}
	
	
	
}
