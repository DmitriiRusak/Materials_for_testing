public class IzmenenieRegistra { 
	public static void main ( String args[] ) throws java.io.IOException{
//Коды АSСII-символов нижнего регистра отличается от кодов соответствующих
//символов верхнего регистра на величину 32. Следовательно, для 
//преобразования строчной буквы в прописную нужно уменьшить ее код на 
//32. Используйте это обстоятельство для написания программы, читающей 
//символы с клавиатуры. При выводе результатов данная программа должна 
//преобразовывать строчные буквы в прописные, а прописные - в строчные. 
//Остальные символы не должны меняться. Работа программы должна завершаться
//после того, как пользователь введет с клавиатуры точку. И наконец, 
//сделайте так, чтобы программа отображала количество символов, для которых
//был изменен регистр.



		
	char simvol,ignore;
	int count=0;
	System.out.println("Vvedite simvol \ndlia vixoda nazzmite '.'");
	for(;;){	
			simvol=(char)System.in.read(); 

			do{
				ignore=(char)System.in.read();
				}while(ignore!='\n');
			//}while(ignore!='\n' && (simvol<97||simvol>122)&&simvol!='.');
			
			if(simvol=='.')break;
			
			if (simvol >= 'A' && simvol <= 'Z') {
			simvol+=32;
			count++;
			} 
			else if (simvol >= 'a' && simvol <= 'z'){
            simvol-=32;
			count++;
			}
 			System.out.println((char)simvol);

			//97-122, a-z
		}	//65-90, A-Z
		System.out.println("Programma zavershena, bilo izmeneno "+count+" simvolov");
	
	}
}