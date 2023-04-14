public class ProverkaChislaNaOpredeleniiaBita {
    public static void main(String[] args) {
//когда требуется выяснить, установлен или сброшен отдельный бит числа 'a', naprimer 4-ii bit, to nam nyzzno vziat 'proverochnoe'
//chislo, bait kod kotorogo bi sostovlial vse nyli '0' za isklycheniem bita #4 kotorii mi xotim yznat, naprimer 'proverochnoe' 
//chislo bydet 8 = 1000 <--eto ego bait kod, a chislo 'a' 4-ii bait kotorogo mi xotim proverit bydet =3245.
//
// 		3245=0000000110010101101     324435=1001111001101010011
//	   &
//  	   8=0000000000000001000          8=0000000000000001000
//-------------------------------    --------------------------
//           0000000000000001000=8          0000000000000000000=0           


//poetoi zakonomernosti naxodiatsia chetnie/nechetnie chisla. Sravnenie chisla proisxodit na chislo 1, bait kod kotorogo =1;
//t.e. 000000000 00000000 00000000 00000001 . Sravnenie proisxodit po poslednemy bity. Esli y proveriaemogo chisla poslednii 
//bit raven 1 to rezyltatom bydet 1 tak-kak y nechetnix chisel poslednii bit==1, a y chetnix ==0;
// chislo 5 = 101   chislo 6 = 110
// chislo 1 = 001   chislo 1 = 001
//---------------   --------------
//            001              000
//t.e. rezyltat vsegda bedet 0 ili proverochnoe chislo zdes ono = 1
//Drygimi slovami 0 ili to chislo na kotoroe delaetsia proverka.

// pobitovii operator '&': 0 & 0=0;    1 & 0=0;    0 & 1=0;    1&1=1;


//v sledyyschem primere yslovie stroitsia na etom zze pravile,proverka vipolniaetsia chisla 'a' na chislo 8 (proveriaem 4-ii bit chisla 'a')
//tak-kak chislo na kotoroe mo proveriaem == 8 to i yslovie dolzno vozvroschat chislo 8 ili 0, proverky ysloviia mozzno delat libo ==0
//libo==8;
// (status & 8)==0 <-- dannoe yslovie tak-zze vernet libo 8 (esli 4-ii bit chisla 'a' ==1), libo 0

		int status;
		String st;

		status = 3245;																									//
        System.out.println(Integer.toBinaryString(status)+"\n        "+Integer.toBinaryString(8));                      //
        st =(status & 8)==0?"bit raven 0":"bit raven 1";                                                                //
        System.out.println(st);	//<-- zdes proveriaemii 4-ii bit chisla: 3245 =1. Yslovnoe virozzenie vernet 'true'     //
		                                                                                                                // yslovie # 1
		System.out.println("-----------------------------------------------------------------------------------------");// 
		                                                                                                                //
		status = 324435;                                                                                                //
        System.out.println(Integer.toBinaryString(status)+"\n               "+Integer.toBinaryString(8));               //
        st =(status & 8)==0?"bit raven 0":"bit raven 1";                                                                //
        System.out.println(st); //<-- zdes proveriaemii 4-ii bit chisla: 324435 =0. Yslovnoe virozzenie vernet 'false'  //
		                                                                                                                //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                                                                                        //
		status = 3245;                                                                                                  //
        System.out.println(Integer.toBinaryString(status)+"\n        "+Integer.toBinaryString(8));                      //
        st =(status & 8)==8?"bit raven 1":"bit raven 0";                                                                // 
        System.out.println(st);	//<-- zdes proveriaemii 4-ii bit chisla: 3245 =1. Yslovnoe virozzenie vernet 'true'     //
		                                                                                                                // yslovie # 2
		System.out.println("-----------------------------------------------------------------------------------------");//
		                                                                                                                //
		status = 324435;                                                                                                //
        System.out.println(Integer.toBinaryString(status)+"\n               "+Integer.toBinaryString(8));               //
        st =(status & 8)==0?"bit raven 0":"bit raven 1";                                                                //
        System.out.println(st); //<-- zdes proveriaemii 4-ii bit chisla: 324435 =0. Yslovnoe virozzenie vernet 'false'  //
		
		//oba ysloviia pravilnie
		
System.out.println("__________________________________________________________________________________________________________");


//v etom primere Ia xotel bi:
//	1)- vziat chislo lyboe, cherez cikl vivesti ego bait-kod; ispolzyia pobitovyy proverky i operator'&'.
//	2)- pomeniat bait-kod chisla na protivopolozzni s pomoschy operatora tilda '~'
//	3)- vivesti na ekran opiat-zze s pomosch`y cikla.
	int chislo =543;
	System.out.println("bait-kod 543:      "+Integer.toBinaryString(chislo));
	System.out.println("bait-kod 1024:    "+Integer.toBinaryString(1024));
	System.out.print("Posle cikla       ");
	for(int i=1024;i>0;i/=2){
		int rezyltatt=(chislo&i)==0?0:1;
		System.out.print(rezyltatt);
	}
	chislo=~chislo;
	System.out.println();
	System.out.print("izmenen bait-kod: ");
	for(int i=1024;i>0;i/=2){
		int rezyltatt=(chislo&i)==0?0:1;
		System.out.print(rezyltatt);
	}
	
System.out.println("__________________________________________________________________________________________________________");

	
	
	
	
	
	
	
	
	
	
	
	
	}
}