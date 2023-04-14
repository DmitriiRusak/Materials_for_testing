//Арифметические операторы:  +; -; *; /;
//операторы сравнения:       ==; !=; >; <; <=; >=;
//логические операторы:      &; &&; |; ||; !; ^; 
//Побитовые операторы :      &; |; ^; <<; >>; <<<; ~;
//Тернарный оператор: 		условие ? результат 1 : результат 2
//										true		  false


// logicheskii operator '^' vozvraschaet true tolko esli oba operanta ykazivayt odinakovoe znachenie (true ^ true) vernet true
//(false ^ false) vernet true, (true ^ false) vernet false.


//'&' proveriaet oba operanta
//'&&' ne proveriaet vtoroi operant, esli pervii=='false'; 
public class VseOperatori { 
	public static void main ( String args[] ) { 
		int i=0;
		for(int in=0;in<100;in++){
			if(false & (++i <100))//ves prikol v primenenii obichnogo operatora sravneniia & kotorii proveriaet 
					//oba operanta v yslovnom virazzenii if, sootvetstvenno Koompilaitor vidit pevii operant
					//on raven "false" i idet smotret drygoi operant (++i<100), no ++i imeet bolshii prioritet 
					//poetomy on snachala delaet ++i a potom sravnivaet (i<100). t.e. operator '&' prosmatrivaet 
					//oba operanta . Iterirovanie i otrozzaet etot fakt, i na kazzdoi iteracii cikla yvelichivaetsia
					//na edinicy. prosmatrivaet i eto i eto.)))
			System.out.println("Eto stroka ne bydet otobrozzatsia");
			System.out.print(i+" ");
		}
		System.out.println();
		for(int in=0;in<=100;in++){
			if(false && (++i <100))//ykorochennii operator && ne proveriaet oba operanta,sootvetstvenno 'i' ne bydet
									//yvelicheno. On proveriaet s leva na pravo i esli yslovnoe virozzenie
									//dolzno vernyt true no pervii iz operantov==false to nezachem proveriat vtoroi
									//operant(dazze esli on bydet true) virozzenie vse ravno vernet false.
				System.out.println("Eto stroka ne bydet otobrozzatsia");
			System.out.print(i+" ");
		}
	
	
	//Побитовые операторы :      &; |; ^; <<; >>; <<<; ~;
	
//razmer primitivnix peremennix v java. Бит — минимальная единица измерения информации в компьютере.
//Существует специальная система счисления, основанная на единицах и нулях — двоичная.
//любое число в Java можно сконвертировать в его двоичную форму. Для этого нужно использовать классы-обертки.
//int x = 342; 
//System.out.println(Integer.toBinaryString(x));<-- 101010110
//101010110 <-- 8 bit = 1 bait
//Именно с bitami мы можем выполнять операции, oni называются побитовыми, cootvetstvenno i operatori pobitovie
//Побитовые операции в Java можно проводить только над целочисленными типами данных. 
//То есть long, int, short, char, byte.

//razmer peremennix v java:
//short		16 бит = 2 байта.
//char      16 бит = 2 байта
//boolean    8 бит = 1 байт
//double    64 бит = 8 байт
//int       32 бит = 4 байта
//byte       8 бит = 1 байт.
//float		32 бит = 4 байта
//long      64 бит = 8 байт
//***********************************************************************************************************************
//	'~' — побитовый оператор “НЕ” 'NOT' применяется не к двум числам, а к одному, перед которым и ставится.
//	означает, что «результирующий бит равен единице, если iznochalnii бит bil равен нулю; и результирующий bit равен нулю, 
// если iznochalnii бит числа bil равен единице»:
//primer: ~0b0011=0b1100; ~0b0000=0b1111; ~0b0101=0b1010;
//Данный оператор просто меняет бит 1 на 0 и 0 на 1.
//101010110 — число 342 в двоичной системe 010101001 — результат выражения ~342 
//Но так как переменная типа int занимает 4 байта, т.е. 32 бита, на самом деле число в переменной хранится как:
//00000000 00000000 00000001 01010110 — число 342 в переменной типа int в java
//11111111 11111111 11111110 10101001 — результат выражения ~342 в java

//***********************************************************************************************************************
// '|' побитовое “ИЛИ”. Принцип работы тот же — сравниваем два числа по битам. Только теперь если хотя бы один из битов
// равен 1, результат будет равен 1.
//
//		100010101 
//     |
//      110110000
//	   -----------
//      110110101 — результат работы '|'         
//
//esche primeri: 0b0011 | 0b1010 = 0b1011; 		0b1110 | 0b0000 = 0b1110
//
//***********************************************************************************************************************
//  '&'— побитовый оператор “И” 'AND' сравнивает два числа по битам, результат будет равен 1 только в том случае, 
// если оба бита равны 1. Во всех остальных случаях результатом будет 0.
// primer: 1 & 1 = 1; 	1 & 0 = 0; 		0 & 1 = 0; 		0 & 0 = 0;
// poniatnei bydet predstavit resshenie v stolbik
//	100101
// &||||||     
//	100110
//-----------
//  100100 		<--rezyltat raboti pobitovogo operatora '&' teper mozzno perevesti v 10-yy sistemy;
//
//t.e. pri ispolzovanii '&' v virazzenii (naprimer: Integer.toBinaryString(277&432)
//koompiliator perevodit kazzdoe iz chisel
//v dvoichnii kod (277=100010101; 432=110110000;) primeniaem '&'
//	100010101 <--277
// &
//	110110000 <--432
//------------
//  100010000 <--rezyltat, perevodim v 10-yy sistemy ischislenia. 100010000 = 272;

//****************************************************************************************************
// '^' — побитовое исключающее “ИЛИ” (также известно как XOR) XOR означает, что «результирующий бит 
//равен единице, если бит числа a равен единице ИЛИ бит числа b равен единице, но не оба одновременно»
//primeri: 1 ^ 1 = 0; 		1 ^ 0 = 1; 		0 ^ 1 = 1; 		0 ^ 0 = 0;
//
//	100010101 	<--277
// ^
//  110110000	<--432
//------------
//  010100101	<-- rezyltat raboti '^' perevedem v 10-yy sistemy = 165;

//****************************************************************************************************
//		Сдвиг битов влево обозначается знаком <<
//Сдвигать биты мы будем влево (это можно определить по направлению знака <<);
//virazzenie x<<y oznachaet:x - chislo nad kotorim provoditsia operacia y=3, na kakoe kolichestvo bit 
//nyzzno proizvesti sdvig. perevodim x v 2-yy sistemy, naprimer: 1000000 (chislo 64), sdvigaem na 3 bitami
//zapolnia obrazovavshiesia novie biti 0 (nyliami);
//sdelaem v stolbik (64<<3)=
//		1000000
// 	 1000000000		<--rezyltat raboti '<<'	perevodim v 10-yy sistemy polychaem chislo 512
//t.e. 64<<3=512;
//			
//Простое правило для запоминания сдвигов влево: При каждом сдвиге влево выполняется умножение числа на 2.
//EEEE - poproboval, ne ochen polychaetsia s etim ymnozzeniem. Poproboval vse verno.
		int x = 5;
		System.out.println(x+"   = "+Integer.toBinaryString(x)); //5   = 101
		x=x<<1;													 				//X=X<<1; V 2-OI SISTEME TOZZE SAMOE CHTO 5*2=10
		System.out.println(x+" = "+Integer.toBinaryString(x));   //10 = 1010
		x=x<<1;													 				//V 2-OI SISTEME TOZZE SAMOE CHTO 10*2=20;
		System.out.println(x+"= "+Integer.toBinaryString(x));    //20= 10100
//
//esche primeri: 0b00000011 << 1= 0b00000110;	0b00000011 << 2= 0b00001100;	0b00000011 << 5= 0b01100000
//
//*****************************************************************************************************
//		Сдвиг битов вправо обозначается знаком >>
//тоже что и '<<'
//primeri: 0b11000011 >> 1=0b01100001; 	... 	0b11000011 >> 20=0b00000000;
//									Важно!
//Самый левый бит числа называется битом знака: хранит 0, если число положительное и 1, если число
// отрицательное.	При сдвиге битов числа вправо, бит знака тоже сместится, и знак числа потеряется при
//этом число дополняется битом 0, если самый левый бит был 0, и битом 1, если самый левый бит был 1.
//
		int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = ~b;
        System.out.println("a =  " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a | b = " + Integer.toBinaryString(c));
        System.out.println("a & b = " + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + Integer.toBinaryString(e));
        System.out.println("~ b = " + Integer.toBinaryString(f));
		
//**********************************************************************************************************************
//					>>>		Сдвиг вправо с заполнением нулями (беззнаковый сдвиг)
//		a>>>b
//
//Где, а — число, биты которого сдвигаем, а b — число, означающее, на сколько бит вправо нужно сдвинуть биты числа a. 
//Этот оператор всегда дописывает слева нулевые биты, независимо от того, какой бит знака был у числа a, polychaem
//iz otricatelnogo chisla plozzitelnoe.
// x= -5;       		                                 v 2-oi sisteme:      11111111111111111111111111111011  =-5
// x=x>>>1;
// System.out.println(x+"= "+Integer.toBinaryString(x)); v 2-oi sisteme:      01111111111111111111111111111101  =2147483645
// s polozzitelnimi chislami prosto dobovliaetsia s leva nol
//	i =     00000000 00000000 00000000 11000000=(192);
//	i>>>1   00000000 00000000 00000000 01100000=(96);
//	i>>>2	00000000 00000000 00000000 00011000=(24);
//	i>>>3   00000000 00000000 00000000 00001100=(3);
//  i>>>4   00000000 00000000 00000000 00000110=();			<--tyt ne yveren



// togda kak operator pobitovogo sdviga '>>' soxroniaet znak starshego bita esli chislo otricatelnoe
//x=-5;															-5= 11111111111111111111111111111011
//x=x>>1;
//System.out.println(x+"= "+Integer.toBinaryString(x));			-3= 11111111111111111111111111111101 znak(1) soxronilsia
//                                          ---------------------------------------------
//											|Практическое применение побитовых операций |
//                                          ---------------------------------------------   
//	Чётность числа:
//		x & 1 - проверяет чётность числа. Если число четное - результат 0, нечетное результат 1.
//eto vse iz-za togo chto cifra 1 v dvoichnii sisteme= 00000000 00000000 00000000 00000001;
//operator & vozvraschaet '1' tolko kogda oba operanda =1; 
//int x=2 = 10;
// 	10
// ^
//	 1
//-----
//  00  <-- rezyltat t.e.=0 <-chilso chetnoe
// v chetnix chislax v dvoichnom predstavlenii poslednii bit vsegda raven '0' a v nechetnix '1'
//sootvetstvenno chetnie chisla v operacii (0 & 1) vsegda bydet vozvraschat 1
// nechetnie & 1 (1 & 1) vsegda bydet vozvraschat chislo s poslednim bitom =0


//	Деление числа на два:
//		x<<1 – ravnosilno умножениy на 2
//		x>>1 - ravnosilno делениy на два с отбрасыванием любого остатка.

//	Шифрование числа:
//		Операция XOR при применении два раза к одному и тому же битовому массиву восстанавливает ее исходное значение.
//		 Это можно использовать при шифровании данных при передаче по сети: 
//





System.out.println("**************************************************************************************************");
//           								Тернарный оператор: 
//Тернарный оператор (или тернарная операция) в языке Java часто используется вместо оператора if-else. 
//Он содержит три выражения - отсюда и происходит название оператора.
//	условие ? результат 1 : результат 2


//	ing age=17;
//	if(age>=18){
//		System.out.println("age bolshe 18");
//	}
//	else{
//		System.out.println("age menshe 18");
//	}
//		etot kod ravnoznachen tamy, chto s nizy.


	int age=17;
	String answer=(age>=18)? "age bolshe 18" : "age menshe 18";
			System.out.println(answer);
//v skobkax yslovi i znak voprosa zatem v pervyy ochered pishem to chto vipolniaetsia v pervyy ochered (esli yslovie =true) 
//i posle znaka ':' to chto vipolnitsia (esli yslovie vernet =false);  (yslovie)? esli true to... : esli false to...
//Yslovie mozzet bit bez skobok

//esche primerchik :
// Zadacha po naxozzdeniy modylia chisla.
		int k;
		i=-10;
		k=i<0?-i:i;
		System.out.println(i+" i ego modyl "+k);

//Если же все три выражения о ператора ? и меют тип boo lean, то сам 
//оператор ? может быть использован в качестве условия для выпол нения цикла 
//или инструкции if

	for ( int t = -5; t < 6; t ++ ) 
		if (t != 0 ? true : false ) 
	System.out.println("lOO / " + t + " равно " + 100 / i ) ; 













	}
}