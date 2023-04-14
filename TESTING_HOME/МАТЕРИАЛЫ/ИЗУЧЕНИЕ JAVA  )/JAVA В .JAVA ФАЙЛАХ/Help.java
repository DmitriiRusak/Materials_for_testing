public class Help{
	public static void main(String args[])throws java.io.IOException{
		char choice,ignore;
        for(;;){
            do{
                System.out.println(" Spravka: \n 1. if \n 2. switch \n 3. for \n 4. while"+
                        "\n 5. do-while \n 6. break \n 7. continue \nDlia vixoda nazzmite 'q'\nVibirite:");
                choice=(char) System.in.read();
            }while((choice<'1'||choice>'7')&& choice!='q');// zdes slavil oshibky tak kak snachala ne vzial
            //cifri 1 i 5 v kovichki,sootvetstvenno proverka proxodila "po intam"
            // a mne nyzzno po tipy char
            //a peremennaia choise tipa char imela drygie znachenie po "intam",
            //polychaetsia po ynikode cifri s 1-5 kodiryytsia drygimi ciframi tak kak peremennaia
            // choice imeet tip char
			
			
			
			
			do{ //zdes System.in.read(); zapisivaet simvol ne chisto (ostaetsoa esche simvol '\n' Posle Enter).
				ignore=(char) System.in.read();// esli vvedeno bolsse 1 simvola to zdes ego perexvatiat
			}while(ignore!='\n');//do nazzatiia Enter t.e. \n
		
            if(choice=='q'){
                break;
            }


            switch(choice){
                case '1':
                    System.out.println ( " Instrykciia if : \n if (yslovie) instrykciia ;" ) ;
                    System.out.println ( " else instrykciia ; " ) ;
                    break;
                case '2':
                    //System.out.println("instrykciia switch : \n

                    System.out.println ( " instrykciia switch: " ) ;
                    System.out.println ( " switch (virazzenie) {") ;
                    System.out.println(" case konstanta 1: " );
                    System.out.println(" posledovatelnost instrykcii \n break \n //..." );
                    System.out.println(")") ;
                    break;
                case '3':
                    System.out.println ( "cikl for \nfor(inicializaciia; yslovie; iteraciia){\ninstrykciia\n}");
                    break;
                case '4':
                    System.out.println ( "cikl while \nwhile(yslovie) \ninstrykciia");
                    break;
                case '5':
                    System.out.println ( "cikl do while \ndo{\ninstrykciia}; \n} while(yslovie);");
                    break;
                case'6':
                    System.out.println("instrykciia break\nbreak ili break metka");
                    break;
                case'7':
                    System.out.println("instrykciia continue\ncontinue ili continue metka");
                    break;

            }
        }

    }
}
		                       