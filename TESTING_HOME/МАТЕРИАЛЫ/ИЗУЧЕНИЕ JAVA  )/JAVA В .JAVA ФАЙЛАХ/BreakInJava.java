public class BreakInJava { 
	public static void main ( String args[] ) throws java.io.IOException{ 
		// klychevim momentom iavliaetsia fakt,chto posle perexoda po metke programma vozobno-
		//vliaet raboty POSLE pomechennogo metkoi bloka koda
		for(int i=1;i<3;i++){
			one:{
				two:{
					three:{
						System.out.println("i ravno "+i);
						if(i==1) break one;
						if(i==2) break two;
						if(i==2) break two;
						if(i==3) break three;
						System.out.println("ne bydet vivedeno esli i nachenaet iteraciy s 1");
					}
					System.out.println("posle bloka three");
				}
				System.out.println("posle bloka two");
			}			
			System.out.println("posle bloka one");
			}
		
		System.out.println("posle cikla for");
		
		
				//наиболее частое применение break+метка является выход из ВНЕШНЕГО цикла во вложенных циклах

		metka:
			for(int i=0;i<10;i++){
				
				for(int a=0;a<5;a++){
					if(a%2==0&&a!=0){
					break metka;
				}
					System.out.print("*");
				}
					System.out.println("cikl s metkoi"+i);
			}
			System.out.println("Bilo prerivanie");
			
			System.out.println("*******************************************************************************" );
			
			//zdes ia ob`edinil 3 cikla v odin blok koda s metkoi 'done'. v 2-om cikle ia prerivay vipolnenie cikla s pomoschy
			// instrykcii 'break' i perexodom po metke. Sootvetstvenno, tak kak vipolnenie programmi peredaetsia vsegda v
			//konec bloka s metkoi, to konkretno zdes 3-ii cikl ne vipolniaetsia voobsche.
			
			// NO esli ybrat figyrnie skobki '}' posle metki 'done' to polychaetsia chto bloka koda ne syschestvyet i
			// logika raboty programmi bydet naryshena, vernee bydet oshibka 'undefined label'
			
			done:{
				for(int i=0;i<5;i++){
					System.out.print("i= "+i+" ");
				}
				for(int q=0;q<5;q++){
					System.out.print("q= "+q+" ");
					if(q==3){
						System.out.println("Vixod iz cikla 'q' bez zaxoda v cikl 'w'");
						break done;
					}
				}
				for(int w=0;w<5;w++){
					System.out.println("w= "+w+" ");
				}
			}
			System.out.println("*******************************************************************************" );

//a zdes poxody nevazzno v bloke 'mark' ili net, tak-kak cikli VLOZZENNIE to yspeshno 
//osyschestvliaetsia perexod po metke.
			mark:
				for(int i=0;i<5;i++){
					for(int q=0;q<5;q++){
						if(q==1){
							System.out.println("prerivanie");
							break mark;
						}
						for(int w=0;w<5;w++){
							System.out.println("w- "+w+" "); 
						}
					}
				}
			
	System.out.println("*******************************************************************************" );
	
	//!!!!!!!!!!!  OOCHEN INTERESTNII KOD   !!!!!!!
	//vazznost ystonovki metki do ili posle
	// otrobativaet tolko pervaia iteraciia vo vneshnem cikle. Tak-kak 
		//ypravlenie peredaetsia na konec bloka otmechenogo 'mark2'.
		// при выполнении инструкции break управление передается в конец 
		//всего блока цикла fоr, а оставш иеся итерации внешнего цикла пропускаются.
	mark2:
		for(int i=0;i<5;i++){
			for(int q=0;q<5;q++){
				System.out.println("i= "+i+" "+" q= "+q);
							if(q==3){
								break mark2;
							}
			}
		}
	
		System.out.println();
	
	
	//метка находится перед открывающей фигурной скобкой 
    //блока кода, определяющего тело внешнего цикла. Поэтому при выполнении 
    //инструкции break mark3 управление передается в конец тела внешнего цикла 
    //for, и далее выполняется очередной его шаг/итерация. 
	
	
		for(int i=0;i<5;i++)mark3:{
					for(int q=0;q<5;q++){
						System.out.println("i= "+i+" "+" q= "+q);
									if(q==3){
										break mark3;
									}
					}
					System.out.println("A eto vipolnitsia?");//net
				}
					System.out.println("A eto vipolnitsia odin raz");//da odin raz

						System.out.println("***********************************************************************");

		//VAZZNO chtob blok koda soderzzal break; inache ne scoompiliryet;
								mark4:
								for(int i=0;i<5;i++){
									System.out.println();
								}
								for(int a=0;a<5;a++){
									break mark4;   //<- error: undefined label
								}
								//esli nyzzno povedenie perexoda po metke to mozzno zdelat blok. Smotri primer nizze!
								//{
								//	mark4:
								//	for(int i=0;i<5;i++){
								//		System.out.println();
								//	}
								//	for(int a=0;a<5;a++){
								//		break mark4;   //<- error: undefined label
								//	}
								//}
System.out.println("----------------------------------------------------------------------------------------------");
			
			metachka:
			for(int i=0;i<5;i++){
				System.out.println();
				if(i==4)break;
			}
			for(int a=0;a<5;a++){
				break metachka;   //<- error: undefined label,nesmotria na to chto v i cikle est break. Nyzzno chtob
				// bil odin blok!!!
				
			}
			
		
		
		
		
		
	
			
	}
}