//'&' proveriaet oba operanta
//'&&' ne proveriaet vtoroi operant, esli pervii=='false'; 
public class YkorochenniiOperator& { 
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
	}
}