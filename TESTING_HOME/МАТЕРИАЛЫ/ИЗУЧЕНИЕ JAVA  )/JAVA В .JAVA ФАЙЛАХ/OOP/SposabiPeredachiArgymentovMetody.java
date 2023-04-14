

public class SposabiPeredachiArgymentovMetody { 
	
//Если методу передается простой тип, например int или douЫe, то он передается по значению. При этом создается копия аргумента, 
//а то, что происходит с параметром, принимающим аргумент, не распространяется за пределы метода. 
	
	static void noChange(int a, int b){
	a=a*b;
	b=-b;
	}



	public static void main ( String args[] ) { 
		int a=2;
		int b=3;
		System.out.println(a+" "+b);
		SposabiPeredachiArgymentovMetody ob=new SposabiPeredachiArgymentovMetody();
		ob.noChange(a,b);
		System.out.println(a+" "+b);//действия, выполняемые в теле метода noChange (), не влияют на значения переменных а и Ь в 
									//вызывающем методе, t.e. v metode main znacheniia etix peremennix ostalos preznee.
		
		SameClass sm=new SameClass(10,10);
		System.out.println(sm.c+" "+sm.v);
		sm.count(sm);
		System.out.println(sm.c+" "+sm.v);
	
	}
}
class SameClass{
	int c;
	int v;
	
	SameClass(int c, int v){
		this.c=c;
		this.v=v;
	}
	
	void count(SameClass ob){//ob`ekti peredaytsia v metodi ne iavno, po ssilke, proisxodit kopirovanie ssilki
		c=ob.c+ob.c;		//odna v parametrax, drygaia v vizivayschei chasti programmi. Sootvetstvenno obe oni sposobni
		v=-ob.v;			//izmeniat svoistvo ob`ekta.
	}
}