/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* cumleolusturma
* </p>
*/
package pkt;

public class CumleOlusturma implements ICumleOlustur {

	RandomSayi rs = new RandomSayi();
	RastgeleKarakterUret rk = new RastgeleKarakterUret();
	String cumle;
	
	@Override
	public String CumleOlustur() 
	{
		cumle="";
		for(int i=0;i<rs.RastgeleSayiUret();i++)
		{
			
			for(int j=0; j<rs.RastgeleSayiUret();j++)
			{
				cumle+=rk.RastgeleKarakter();
			}

			cumle+=" ";
		}
		cumle+=".";
		return cumle;
	}
	
	@Override
	public String BuyukCumleOlustur() 
	{
		cumle="";
		for(int i=0;i<rs.RastgeleSayiUret();i++)
		{
			
			for(int j=0; j<rs.RastgeleSayiUret();j++)
			{
				cumle+=rk.BuyukKarakter();
			}
			cumle+=" ";
		}
		cumle+=".";
		return cumle;
	}
	
	@Override
	public String KucukCumleOlustur() 
	{
		cumle="";
		for(int i=0;i<rs.RastgeleSayiUret();i++)
		{
			
			for(int j=0; j<rs.RastgeleSayiUret();j++)
			{
				cumle+=rk.KucukKarakter();
			}
			cumle+=" ";
		}
		cumle+=".";
		return cumle;
	}
	
	

}
