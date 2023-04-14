//dli togo chtob zapystit programmy iz komandnoi stroki 
//java ArgymentiVKomandnoiStroke.java Dmitrii Elena
//t.e. argymenti ykazivaytsia posle nazvaniia zapyskaemogo faila cherez probel.
//no chto elsi poprobovat zapystit etot fail cherez IDE IntellegIdea
//esli prosto nazzat na run to v programmy peredastca 0 argymentov
//nado nazzat na zelenii treygolnik naprotiv main,vibrat "modify run configyration",
//ykazat/propisat v pole "Programm argyments" zzelaemie argymenti cherez probel, nazzt ok.
//zatem nazat na run (kak obichno) esli nado pomeniat argymenti delaem vse zanovo.


public class ArgymentiVKomandnoiStroke {
    public static void main(String[] args) {
	
	String array[][]={
	{"Elena","12345"},
	{"Dmitrii","678910"},
	{"Kirill","54321"},
	{"ZZenia","109876"}};
	
	if(args.length>=1){
		for(int i=0;i<args.length;i++){
			for(int a=0;a<array.length;a++){
				if(args[i].equals(array[a][0])){
					for(int s=0;s<array[a].length;s++){
						System.out.print (array[a][s]+" ");
					}
					System.out.println();
				}
			}
		}
	}
	else{ 
	System.out.println("Argymenti komandnoi stroki= "+args.length);
		}
	
	}
}