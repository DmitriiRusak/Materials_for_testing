public class SystemInRead{
	public static void main(String args[])throws java.io.IOException{
		
	//v obschem est interestnii moment s System.in.read(); dannaia instrykciia
	//osyschestvliaet vvod simvola s konsoli. Nazzimaesh simvol, a zatem Enter.
	//Esli System.in.read(); stoit v beskonechnom cikle i bil nazzat odin simvol
	//char cimvol=System.in.read();
	// a zatem Enter to System.out.println((int) simvol)- vivedet nomer simvola
	//v ASCII i esche 10. Prikol sostoit v tom chto v byfer obmena vnositsia i 
	//simvol perenosa stroki, kod kotorogo 10, i esche simvol slesh '/', v obschem
	// vse to chto vvoditsia posle nazzatiia Enter, ved po fakty mi na nego tozze
	//nazzali.
	
	//for(;;){
	//	char ch =(char)System.in.read();
	//	System.out.println((int)ch);
	//}
//-------------------------------------------------------------------------------------------	
	

	//for(;;){
	//	ch=(char)System.in.read(); //syda popodaet simvol kotorii mi nazzimaem na klave
	//	System.out.println((int)ch);
	
	//do {                         //syda vse ostoloe filtryetsia i otseivaetsia
	//	ignore = (char)System.in.read(); //mozzno vvesti mnogo simvolov oni otseytsia
	//	} while ( ignore != '\n' );      //cikl zakonchitsia kogda vveden Enter
	//	if(ch=='q')break;
	//}
//=============================================================================================	
	
	//zdes vvodim tolko odin simvol i nazzimaem Enter.
	//for (; ; ) {
//            ch = (char) System.in.read();     //<-simvol zapisivaetsia syda
//            System.out.println((int) ch);
//
//            ignore = (char) System.in.read(); //<- syda zapisivaetsia simvol Enter
//            System.out.println((int) ignore);
//        }
	
	//vse nyansi s byferam obmena aktyalni tolko dlia cikla beskonechnogo
	//DA I KAK RABOTAT S int-ami neponiatno.
	
	
	
	
	
	}
}