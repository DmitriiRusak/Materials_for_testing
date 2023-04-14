//massiv eto stryktyra dannix представляет собой линейный список элементов, допускающий 
//произвольный доступ к ним





public class StartingWithArrays { 
	public static void main ( String args[] ) { 
	//int array1[]=new int[10];
	//array1[0]=25;
	//array1[1]=67;
	//array1[2]=45;
	//array1[3]=73;
	//array1[4]=44;
	//array1[5]=26;
	//array1[6]=98;
	//array1[7]=453;
	//array1[8]=3;
	//array1[9]=254;
	// a mozzno inicializirovat array vot-tak
	
	int array1[]={25,55,43,23,65,23,55,33,76,11};
	
	int min=array1[0];
	int max=array1[0];
	
	for(int i=0;i<array1.length-1;i++){
		if(array1[i]<min)min=array1[i];
		if(array1[i]>max)max=array1[i];	
	}
	System.out.println("min= "+min+" "+"max= "+max);
	System.out.println();
	
//*******************************************************************************
	// 2-D array
// v pervix skobkax kolichestvo massivov, vo vtorix dlinna kazzdogo massiva
	int counter=0;
	int twoD [][]=new int [3] [5]; 
	for(int i=0;i<twoD.length;i++){//twoD.length-kolichestvo massivov v twoD.
		for(int a=0;a<twoD[i].length;a++){//twoD[i]-kolichestvo elementov v
			twoD[i][a]=counter; // kazzdogom posledyyschem massive
			counter++;
		}
	}
	for(int i=0;i<twoD.length;i++){
		for(int a=0;a<twoD[i].length;a++){
		System.out.print(twoD[i][a]+" ");
		}
		System.out.println();
	}
		System.out.println();
//()()()()()()()(())()()()()()()()())()()()()()()()()()()()()()()()()()()()()()()
//mozzno zadavat raznyy dlinny v kazzdom massive 2-mernogo massiva.	
//poxody massiv gde est raznoi dlinny massivi nazivaetsia -нерегулярным
	int temp[][]=new int [3][];
	temp[0]=new int[5];
	temp[1]=new int[3];  // <-sintaksis opredeliaem dlinny kazzdogo massiva.
	temp[2]=new int[1];
	
	for(int i=0;i<temp.length;i++){
		for(int a=0;a<temp[i].length;a++){
			temp[i][a]=counter;
			counter++;
		}
	}
	for(int i=0;i<temp.length;i++){
		for(int a=0;a<temp[i].length;a++){
		System.out.print(temp[i][a]+" ");
		}
		System.out.println();
	}
//==-=--=-=-==--==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
// prisvoenie odnoi ssilki na dryguy, 

//pri etom esli povedenie y massivov kak y ob`ektov,logichno
//predpolozzit chto massiv y kotorogo "zabrali" ssilky bydet sobran garbage collektorom. 
//A massiv kotoromy prisvoili dopolnitelnyy ssilky bydet dostypen po dvym ssilkam...
	int array_1[]={-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
	int array_2[]={1,2,3,4,5,6,7,8,9,10};
	array_2=array_1;
		for(int i=0;i<array_2.length;i++){
			System.out.print(array_2[i]+" ");//25 55 43 23 65 23 55 33 76 11 vivedet array1 !!!
										//t.e. 2-e ssilki ykazivayt na odin massiv(massivi-eto ob`ekti);
		}
System.out.println("\n///////////////////////////////////////////////////////////////////////////");
//kopirovanie massiva
//kogda kopiryem iz odnogo massiva v drygoi to iteraciy v cikle sledyet vibirat po dlinne
// massiva kyda kopiryem, a vot i net !!! nado vibirat menshyy dlinny iz dvyx ili odinakovoyy
//esli massivi odinakovy
//v celom nado stavit pered kopirovaniem poverky, naprimer cherez 
//if(arrayk_2.length<=arrayK_1.length){
// for(int i=0;i<arrayk_2.length;i++){...}
//else if (arrayk_2.length>=arrayK_1.length){
// for(int i=0;i<arrayk_1.length;i++){...}


	int arrayK_1[]={67,88,54,65,8,8,4,456,90};
	//int arrayk_2[]=new int[arrayK_1.length];//variant s odinakovoi dlinnoi
	int arrayk_2[]=new int[5];//variant s menshei dlinnoi
	//int arrayk_2[]=new int[15];//variant s bolshei dlinnoi-zdes Exception array index out of bounds
	
	for(int i=0;i<arrayk_2.length;i++){//mi iteriryem dlinny etogo massiva(kotorii koroche)
//for(int i=0;i<arrayK_1.length;i++){ tak viletim zapredeli dlinni massiva,arrayK_1 dlinnee chem arrayk_2.
		arrayk_2[i]=arrayK_1[i];
	}
	for(int i=0;i<arrayk_2.length;i++){
		System.out.print(arrayk_2[i]+" ");
	}













	}
}