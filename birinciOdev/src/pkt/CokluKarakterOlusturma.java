/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
*coklukarakterolusturmahj
* </p>
*/
package pkt;

public class CokluKarakterOlusturma implements ICokluKarakterOlusturma{

	String sonuc;
	RastgeleKarakterUret rk;
	
	public CokluKarakterOlusturma() {
		
		sonuc="";
		rk=new RastgeleKarakterUret();
	}
	@Override
	public String CokluKarakterOlusturma(int a) {
		sonuc="";
		if(a==0 || a==1)
		{
			
			throw new IllegalArgumentException();
			
		}
		
		for(int i=0; i<a; i++)
		{
			sonuc+=rk.RastgeleKarakter();
		}
		
		return sonuc;
	}
	
	
	

}
