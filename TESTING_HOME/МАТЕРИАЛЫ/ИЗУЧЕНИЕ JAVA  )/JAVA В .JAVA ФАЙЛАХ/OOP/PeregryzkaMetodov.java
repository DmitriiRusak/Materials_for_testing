//тип возвращаемого значения не учитывается при перегрузке методов.
//t.e. nedostatochno izmenit tip vozvraschaemogo znacheniia chtob peregryzit metod.
//Dlia etogo nado izmenit kolichestvo parametrov v metode. i / ili tip znacheniia parametrov.
//перегружать следует только тесно связанные операции (poxozzee povedenie metodov).



public class PeregryzkaMetodov { 
	
	void method(){
		System.out.println("Pervii metod");
		}
		
	int method(int a){
		System.out.println("vtoroi metod s odnim parametrom int "+a);
		return a;
	}

	String method (String st){
		System.out.println("Tretii metod s odnim parametrom, no tipa String "+st);
		return st;
	}
	
	//void method(int a){	<--oshibka. izmenenie tolko tipa vozvraschaemogo znacheniia ne
	//}						// iavliaetsia peregryzkoi metoda.

	void f(int a){
		System.out.println("Vnytri metoda s parametrom int = "+a);
	}
	
	void f(double d){
		System.out.println("Vnytri metoda s parametrom double = "+d);
	}
	
	
	
	public static void main ( String args[] ) { 
	PeregryzkaMetodov ob=new PeregryzkaMetodov();
	ob.method();
	int a=ob.method(5);
	String st=ob.method("Stroka kakaia-to");
	
	System.out.println("******************************************************");
	
	byte bt=10;
	short sh=15;
	float fl=1.1f;
	ob.f(bt);	//Vnytri metoda s parametrom int = 10
	ob.f(sh);	//Vnytri metoda s parametrom int = 15
	ob.f(fl);	//Vnytri metoda s parametrom double = 1.100000023841858
	//nesmotria chto metod f(); prinimaet tolko int ili double. Peredovaia v metod 'menshie' tipi znacheniia oshibki ne voznekaet
	// tak-kak proisxodit neiavnoe privedenie tipov.
	
//В данном примере определены только два варианта метода f ( ) : один имеет параметр типа int, а второй - параметр типа douЬle. Но
//передать методу 
//f () можно также значение типа byte, short и float. Значения типа byte и 
//short исполняющая среда Java автоматически преобразует в тип int. В результате будет вызван вариант метода f ( int) .
//А если параметр имеет значение типа float, то оно преобразуется в тип double, и далее вызывается вариант метода f ( douЬl e ) . 

//Vажно понимать, что автоматическое преобразование типов выполняется лишь в отсутствие прямого соответствия типов параметра и аргумента
//naprimer esli-bi v klasse bil metod
//	void f(byte by){
//		...
//	}
//To pri vizove metoda f() c argymentom byte, iz main, vipolnilsia bi metod f(byte) a ne f(int). Privedenie rabotaet esli net 
//sovpadeniia tipov.
	
	
	
	}
}