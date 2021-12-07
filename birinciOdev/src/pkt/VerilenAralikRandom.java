/**
*
* @author ZeynepBurcuBastug zeynep.bastug@ogr.sakarya.edu.tr
* @since 24.04.2021
* <p>
* verilenaralik kodu
* </p>
*/
package pkt;

public class VerilenAralikRandom {

	public static char RandomCh(char ch1, char ch2)
	{
	    char retVal;

	       int val1= (int) ch1; 
	       int val2= (int) ch2; 

	       
	       retVal=(char)(val1+(int)(Math.random()*((val2-val1)+1)));
	       return retVal;
	      
		
	}
}
