public class RaznovidnostiFor { 
	public static void main ( String args[] ) throws java.io.IOException{ 
		//for(int i=0;(char)System.in.read()!='z';i++){
			//System.out.print(i+",");         //neznay kak eto rabotaet do konca.
			//System.out.println(" * * * "+(char)i+" * * * ");
			
			
			
			
			//for(int i=0;i<500;i++){ 
			//System.out.println(i+"    "+(char)i+" ");
			
			
			
			
			//for (int i = 0; i < args.length; i++) {
			//	System.out.println(args[i]);
				// v konsoli pishesh chto-to tipa
				//java ./pyt k faily./RaznovidnostiFor.java i_tyt_argymenti_kakie_xochesh
			//}
			
			
			
			//int sum=0;
			//for(int i=0;i<=5;sum += i++);//sum = sum + i;  zatem   i ++; 
			//	System.out.println(sum);// rezyltat:15;
			
			
			// do while; s vlozzennim do while;
			//interesno chto instrykciia ch=(char) System.in.read();zapisivaet tolko odin pervii simvol v ch, ne vazno skolko simvolov bilo
			// vvedeno s konsoli, poetomy poxozze chto vnytrenni do{} while(); ne nyzzen. po zadymke avtora programmi-esli vvodish 
			// bolshe 1-go simvola to eti simvoli ignoriryytsia do nazzatiia Enter(/n), no pofakty koompiliator ne zapisivaet bolshe
			// pervogo simvola v peremennyy ch.
//Koompiliator kakrastako zapisivaet v byfer obmena vse vvedennie simvoli, no eto moment viden pri ispolzovanii besconechnogo cikla !!!
//takzze v befere lezit i simvok Enter-a , a imenno '\n' . Poetomy avtor i primeniaet proverky...
			
			//char ch;
			//char ignore;
			//char answer='k';
			
			//do{
			//	System.out.println("zadymana bykva iz diapazona: A-Z. \n Popitaites ee ygodat:");
			//	ch=(char) System.in.read();
				
			//	//do {
			//	//	ignore=(char) System.in.read();  //esli etot cikl zakomentirovat to po fakty nichego ne pomeniaetsia.
			//	//}	while(ignore!='\n');
				
			//	if(ch == answer){
			//		System.out.println("Pravilno, zadymannaia bykva "+ch);
			//		}
			//	else{
			//		System.out.println("Nyzznaia bykva naxoditsia ");
			//		if(answer<ch){
			//			System.out.println("blizze k nachaly alfavita");
			//		}
			//		else{
			//			System.out.println("blizze k koncy alfavita");
			//		}
			//	}
			//	}while(answer!=ch);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//otlichiia for_each ot for.

			int nums[]={1,2,3,4,5,6,7,8,9,23};
			
			for(int i=0;i<nums.length;i++){//mne kazzetsia chto for bolee gibkii v plane nastroiki iteracii cikla...
				System.out.print(nums[i]+" ");//no eta gibkast cherevata oshibkami tipa ArrayIndexOutOfBoundsException
			}								//togda kak for-each pozvoliaet ne dymat ob yslovii zavershenia cikla 
											//eto proisxodit avtomaticheski
			
			System.out.println();
			
			
			for (int x : nums){ //adaptirovan bolshe pod kolekcii
				x*=10;//iteracionnaia peremennaia obespechivaet tolko chtenie iz massiva, i vse !!! ona ne vidoizmeniaetsia
			}		// i ne prisvaevaet znacheniia elementam massiva. Dymay eto sviazano s iavleniem chto 
			for(int x : nums){ //kogda perebiraeshh kolekciy nelzia ydalit element v takom cikle. 
								//polychim ConcurrentModificationException;
				//System.out.print(nums[x]);	
				System.out.print(x+" ");
			}
//v tozze vremia elementi kolekcii xot i nelzia ydaliat (pri etom meniaetsia dlinna kolekcii i iz-za etogo naverno typit
//iteracionnaia peremennaia, poetomy i izmeniat dlinny vo vremia proxozzdeniia cikla nelzia)no mozzno vidoizmeniat v for_each
//prisvoit iteracionnoi peremennoi cikla for-each novoe znachenie nelzia, ona ne vidoizmeniaetsia.

System.out.println("\n/////////////////////////////////////////////////////////////////////////////////");
//for-each i 2D array
//!!!! interestnii kod !!!!!
	int sum=0;
	int numsi [][]=new int [3][5];
	for(int i=0;i<numsi.length;i++){
		for(int o=0;o<numsi[i].length;o++){
			numsi[i][o]=(i+1)*(o+1);
		}
	}//nums eto massiv massivov s odnim i temzze tipom (int);znachit
	for(int f []:numsi){//<--zdes iteracionnaia peremennaia eto ssilka na odnomernii massiv intov !!!
		for(int s:f){//<- a zdes iteracionnaia peremennaia tipa int tak-kak v massive soderzzatsia int
			System.out.print(s+" ");
			sum+=s;
		}
		System.out.println();
	}
		System.out.println(sum);

				
				
				
				
				    
				
				
			
				
			
			
	}
}