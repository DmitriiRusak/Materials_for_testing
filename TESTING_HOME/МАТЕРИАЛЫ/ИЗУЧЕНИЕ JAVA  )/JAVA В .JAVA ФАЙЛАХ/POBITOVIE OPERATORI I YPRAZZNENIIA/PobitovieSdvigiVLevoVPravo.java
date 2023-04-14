public class PobitovieSdvigiVLevoVPravo {
    public static void main(String[] args) {
		
//1)-	vivesti bait kod chisla: 1;
//2)-	zdelat sdvig v levo na 1 razriad, vivesti bait kod chisla 1 snova.
//3)-	tak zdelat 8 raz. A pochemy 8? da mozzno skoka xochesh, tolko 128 nado * 2 chtobi bit videl
//VAZZNO: pri rabote s pobitovimi operatorami ne imeet znacheniia kak stavit operandi v operacii (a ^ b) ili (b ^ a), rezyltat ot etogo ne
//meniaetsia
//операторы сдвига можно использовать для умножения (esli sdvig v levo) или деления (esli sdvig vpravo)числа на два
		
		int val=1;
		int rezalt=0;
		for(int i=0;i<11;i++){
			for(int t=1024;t>0;t/=2){
				rezalt=(val&t)==0?0:1;// vivodim bait-kod peremennoi val stolko, raz poka 1024/2 ne dast =0
				System.out.print(rezalt);
			}
			val=val<<1;				// bila '1', sdvigaem bit na '1' v levo polychaem drygoe chislo v val, i idem ego vivodit
			System.out.println();	
		}
		
		
		System.out.println();
								//posle predidyschego cikla val ==256, esli ne prisvoit znachenie 128 to polychitsia pystaia stroka
		val=128;				// iz '00000000' tak kak starshii bit 256 naxoditsia na razriad vishe chem y chisla 128 kotoroe 
		for(int i=0;i<8;i++){	// prizvana otrazzat biti s pomosch`y '&'. T.e. 256=100000000
			for(int t=128;t>0;t/=2){                       //                   128=010000000
				rezalt=(val&t)==0?0:1;						//                      000000000   <-- rezalt vse '0'				
				System.out.print(rezalt);
			}
			System.out.println();
			val=val>>1;
			
		}
	
	}
}
//Rybrika chto ponravilos v kode primera:
//	chislo kotoroe ranshe ia vivodil v bait-kod tolko edinazzdi,(v cikle) zdes s pomosch`y vlozzennix ciklov mi vo vnytrennem cikle vivodim
//kolichestvo bit rezyltata. Zatem vo vneshnem cikle chislo meniaetsia za schet pobitovogo sdviga v levo na edinicy (na 1 bit), 
//i mi snova ego vivodim vo vnytrennem cikle,t.e. ego bait-kod. Graficheski eto vigliadit krasivo

//00000000001
//00000000010
//00000000100
//00000001000
//00000010000
//00000100000      <--pervaia chast programmi, gde chislo '1' yvelichivaetsia kazzdyy proxod cikla na 1
//00001000000
//00010000000
//00100000000
//01000000000
//10000000000

//10000000
//01000000
//00100000
//00010000
//00001000
//00000100
//00000010
//00000001