public class PrivedenieElementarnixTipov { 
	public static void main ( String args[] ) { 
		byte b=10;
		int i=b*b;
		System.out.println(i); //i=100;
		
		//b=b*b; //zdes oshibka -compilation failed
		//incompatible types: possible lossy conversion from int to byte чтобы решить выражение коомпилятор переводит
		// всё в int, а затем обратно, необходимо зделать явное приведение типов
		
		b=(byte)(b*b); //так всё работает исправно.
		System.out.println(b);
	//****************************************************************************************************************	
		//или с char тоже самое!
		char ch1='a', ch2='b';
		//char ch3=ch1+ch2; обратно же так не работает. надо делать явное приведение типов, так как тип char представляет 
		//собой тип int в unicode
		char ch3=(char)(ch1+ch2);
		System.out.println(ch3);
		
	//****************************************************************************************************************	
	//тоже интересно
	
		for(int s=0;s<5;s++){
			System.out.println(s+" / 3 = "+s/3);
			System.out.println(s+" / 3 s privedeniem k double= "+(double)s / 3);
			System.out.println();
		}
		char iee=55209 ;
		System.out.println(iee);
	}
}