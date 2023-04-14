public class OperatorContinue { 
	public static void main ( String args[] ) throws java.io.IOException{ 
	
	//pozvoliaet zakonchit shag iteracii cikla dosrochna
	//t.e. kak break tolko ne dlia vsego cikla a dlia odnogo shaga iteracii
	
	
	for(int i=0;i<100;i++){
		if(i%2!=0)continue;//при обнаружении нечетного числа шаг итерации цикла завершается досрочно
		System.out.print(i+" ");
	}
	
	System.out.println();
	
	//в инструкции continue может быть указана метка, обозначающая тот охватывающий цикл, выпол нение которого 
	//должно быть продолжено. T.E. esli nyzzno ostonovit iteraciy tekyschego cikla dostatochno odnogo continue.
	//Esli trebyetsia ostonovit tekyschyy iteraciy vnytrennego cikla i pereiti na sledyyschii shag iteracii 
	//vneshnego cikla to ispolzyem continue smetkoi v vnytrennem cikle
	contMetka:
		for(int i=0;i<10;i++){
			System.out.print("i= "+i+" vnytrennii cikl: ");
			for(int a=0;a<10;a++){
				if(a==5){
					System.out.println();
					continue contMetka;//esli zdes postavit break,to vneshnii cikl zavershitsia
				}					// a continue + Metka osyschestvliaet perexod na iteraciy vneshnego cikla
				System.out.print(a);// sootvetstvenno continue + Metka peredaet ocherednost vipolneniia programmi
				//v nachalo pomechennogo bloka?
			}
		}
	
	}
}