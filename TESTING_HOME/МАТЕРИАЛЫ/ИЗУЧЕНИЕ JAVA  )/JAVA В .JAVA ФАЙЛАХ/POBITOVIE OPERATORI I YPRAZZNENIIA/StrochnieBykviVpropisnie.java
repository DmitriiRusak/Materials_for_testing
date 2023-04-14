public class StrochnieBykviVpropisnie {
    public static void main(String[] args) {
	char ch;
	
	for(int i=0;i<26;i++){
		ch=(char) ('a'+i);				//   <--vivod alfavita
		System.out.println(ch+" - "+(int)ch+" -- "+Integer.toBinaryString((int)ch));
		
		ch = ( char ) ( ( int ) ch & 95 ) ;
		System.out.println("         &"+Integer.toBinaryString(95));//v knige primer s chislom 65503, no glavnoe chtob bilo 1011111
		System.out.println(ch+" - "+(int)ch+" -- "+Integer.toBinaryString((int)ch));// t.e pomeniat znachenie 6-go bita,a drygie 
		System.out.println("------------------------");	//biti ne trogat. Operator '&' idealno podxodit.
														//smotri vivod v konsol.
	}
	
	
	
	}
}