public class ShifrovanieIDeShifrovanie {
    public static void main(String[] args) {
		String isxodnoeSoobschenie = "Shifrovannoe soobschenie";
        String encmsg="";
        String decmsg="";
        String maska="sistemnik";

        System.out.println(isxodnoeSoobschenie);

        for(int i=0;i<isxodnoeSoobschenie.length();i++) {
            encmsg += (char)(isxodnoeSoobschenie.charAt(i)^maska);  //kodirovanie stroki
        }
        System.out.println(encmsg);

        for(int i=0;i <encmsg.length();i++){
            decmsg+= (char) (encmsg.charAt(i)^maska);               //razkodirovka stroki
        }
        System.out.println(decmsg);
    



//s pomoschy charAt() kotorii vozvraschaet simvol iz ykazannogo indexa stroki, k etomy simvoly primeniaetsia pobitovii operator
// '^' isklychyschee ili (0^1=1; 1^0=1; 0^0=0; 1^1=0; <--po syti meniaet bitovoe znachenie na protivopolozznoe bitovoe znachenie) i maska.
//maska - eto slychainoe chislo, bait-kod kotorogo ispolzyetsia v vichisleniiax s bait-kodom simvola, polychennogo s pomosch`y .charAt();
//Drygimi slovami lyboi simvol imeet predstavlenie v unicode tablice v vide desiatichnogo chisla, ono imeet predstavlenie v 2-oi sisteme
//t.e. kogda delaem 'S'^maska to na 'nizkom' yrovne eto vzaimodeistvie mezzdy bitami. Kogda v operacii ychastvyet pobitovii operator to
//operaciia vsegda provoditsia na bitovom yrovne!!! na BITOVOM YROVNE!!!
//primer:
//     S =83=1010011;
//    ^
// maska =55=0110111;
//--------------------
//           1100100   <-- eto rezyltat, a v 10-oi sisteme eto bydt =100, pervedem v simvol='d';




//			TOZZE SAMOE S TIPOM DANNIX STRING V KAHESTVE maski


// Zadacha: zdelat tozze chto i v predidyschem ypr. no v kachestve maski ispolzovat tip ne int, a String

//		  String message="Мне нравится java";
//        String encodedMessage="";
//        String maska="12345678";
//        String decodedMesage="";
//        int countMaska=0;	//<--nyzno ispolzovat otdelnii schetchik, Ne schetchika cikla. Tak-kak v maske 8-simvolov, a y message simvolov bolshe, i v ramkax odnogo 
//                           cikla esli ne skinyt schetchik maski na 0 pri dostizzenii schetchika 8. to bydet: String index out of range: 8
//        for(int i=0; i<message.length();i++){
//            encodedMessage+=(char) (message.charAt(i) ^ maska.charAt(countMaska));
//            countMaska++;
//            if(countMaska==8)countMaska=0;
//        }
//        countMaska=0; //Takzze nado skinyt na 0, tak-kak rashifrovka dolzzna sovpodat s simvolami mask tak-zze kak bilo pri kodirovke
//        System.out.println(encodedMessage);
//
//        for(int i=0; i<message.length();i++){
//            decodedMesage+=(char) (encodedMessage.charAt(i) ^ maska.charAt(countMaska));
//            countMaska++;
//            if(countMaska==8)countMaska=0;
//        }
//        System.out.println(decodedMesage);
//
//
        }
    }
























