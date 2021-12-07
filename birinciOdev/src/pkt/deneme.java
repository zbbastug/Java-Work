/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* cýktý kodu
* </p>
*/


package pkt;

public class deneme {
	   public static void main(String[] args)
	    {

		RastgeleKarakterUret rko= new RastgeleKarakterUret();
		CumleOlusturma co= new CumleOlusturma();
		CokluKarakterOlusturma ck = new CokluKarakterOlusturma();
		VerilenAralikRandom vr = new VerilenAralikRandom();

		
		System.out.println("Karakter-- "+rko.RastgeleKarakter());
		System.out.println("Karakter-- "+rko.RastgeleKarakter());

		System.out.println();

		System.out.println("Büyük Harfli Karakter-- "+rko.BuyukKarakter());
		System.out.println("Küçük Harfli Karakter-- "+rko.KucukKarakter());

		System.out.println();

	    
		System.out.println("3 adet karakter-- "+ck.CokluKarakterOlusturma(3));
		System.out.println("3 adet Karakter-- "+ck.CokluKarakterOlusturma(3));

		System.out.println();

	    
		System.out.println("Cümle-- \n"+co.CumleOlustur());
		System.out.println("Cümle-- \n"+co.CumleOlustur());

	
	    System.out.println();
	        
		System.out.println("Küçük Harfli Cümle-- \n"+co.KucukCumleOlustur());
		System.out.println("Büyük Harfli Cümle-- \n"+co.BuyukCumleOlustur());
	
		System.out.println();
		 
		System.out.println("a ve o arasý: "+vr.RandomCh('a', 'o'));
		System.out.println("a ve o arasý: "+vr.RandomCh('a', 'o'));
	    }

}
