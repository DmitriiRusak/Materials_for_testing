public class PerevestiChisloVdvoichniiKod {
    public static void main(String[] args) {
	
//Syt zadachi v tom chtobi perevesti chislo v ego dvoichnoe predstavlenie
//zdes chislo kotoroe nyzzno perevesti: byte val=123;

//   123 = 1111011

//Itak mi znaem chto blagodaria pobitovomt operatory '&' proizvodiatsia deistviia 0&1=0; 1&0=0; 0&0=0; 1&1=1; t.e. mozzno proverit kakoi
//znak imeet bait '0' ili '1'.
//esli vziat lyboe chislo y kotorogo vse biti =0,a starshii bit (s leva) raven 1, prietom ochen vazzno chtobi starshii bit 
// bil 1 i bil na odin razriad bolshe chem y chisla kotoroe mi sobiraemsia perevesti (zdes 'val').
//primer: mi perevodim chislo 123 !!! ischem chislo kotoroe bydet sootvetstvovat nashim trebovaniiam, nazovem ego 'B';
//	123 = 1111011;
//b=125 = 1111101	<-- ne podxodit, tak kak pochti vse biti zaniati '1'


//	123 = 1111011;
//	127 = 1111111; <-- ne podxodit, tak kak vse biti zaniati '1'


//	123 = 01111011;
//	128 = 10000000; <-- podxodit! vse nyli, a starshii bit ='1',pri etom po schety on vishe na razriad chem y chisla 123; na etom meste
//						y chisla 123 stoit '0'. Nashe chislo 'B'=128;
//val=123=00000000 00000000 00000000 01111011
//B = 128=00000000 00000000 00000000 10000000

//teper primenim pobitovii operatop '&' tem samim mi proverim kakoi znak y starshego bita chisla 'val'

// 123=00000000 00000000 00000000 01111011
//	&
// 128=00000000 00000000 00000000 10000000
//----------------------------------------
//	   00000000 00000000 00000000 00000000	<-- polychaem 0, starshi bit chisla kotoroe mi perevodim raven =0, teper sledyyschii bit



//chtob proverit sledyyschii bit, nado B/2 (128 / 2 = 64); etim proisxodit sdvig chisla 'B' v pravo na 1 bit
// 123=00000000 00000000 00000000 01111011
//	&
//  64=00000000 00000000 00000000 01000000	<--bit sdvinylsia v pravo na 1 razriad
//----------------------------------------
//	   00000000 00000000 00000000 01000000	<-- polychaem 1, proveriaemi bit =='1';




//chtob proverit sledyyschii bit, nado 64 / 2 = 32
// 123=00000000 00000000 00000000 01111011
//	&
//  32=00000000 00000000 00000000 00100000		<--bit sdvinylsia  esche v pravo na 1 razriad
//----------------------------------------
//	   00000000 00000000 00000000 00100000	<-- polychaem 1

//Takim obrazom mi vsegda (podeliv chislo B na 2) sdvigaem bit chisla B v pravo na 1 razriad, zatem s pomoschy '&' 
//proveriaem ocherednoi bit nashego chisla val, chemy on raven.

//V celom nado zapomnit chto proverit znak bita mozzno s pomoschy '1' tak zze kak v ypr na chetnie i nechetnie, tolko tam proveriali posled-
//nii bit chisla a zdes nyzzno proverit vse bity poocheredi (delia chislo B/2 )i chtobi eto zdelat nado iznachalno naiti chislo 'B' v 
//kotorom vse '0' krome starshego bita. Provesti operaciy s '&', zatem ymenshit B na odin razriad razdeliv ego na 2. Snova proverit, i t.d.

        int []decimalLook=new int[8];
        byte val=123;
        System.out.println("01111011 <-- Polychennoe znachenie v cikle");
        System.out.println(" "+Integer.toBinaryString(val)+" <--Znachenie val");
        for(int count=0,t=128; t>0;t=t/2,count++) {
			decimalLook[count]=(val&t)==0? 0:1;
            System.out.println(val + " - 0" + Integer.toBinaryString(val));
            System.out.println(t + " - " + Integer.toBinaryString(t));
        }
		for(int i=0;i<decimalLook.length;i++){
			System.out.print(decimalLook[i]+" ");
		}
		
	
	
	
	}
}