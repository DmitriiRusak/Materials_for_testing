public class VvodSimvolaCherezSistemIn { 
	public static void main ( String args[] ) throws java.io.IOException{ 
	//vvod simvola s pomoschy klassa System
	
	System.out.println("Moozzna vvesti simvol");
	
	//char ch= (char) System.in.read();//preonbrazyem do tipa char,tak kak rezyltat vozvraschaet-
	//sia v int
	
	int ch=System.in.read();
	
	System.out.println(ch);
	}
}