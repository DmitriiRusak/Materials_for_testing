// v konsoli, pri proverke kodirovki s pomosch`y komandi chcp polychal otvet 1251
//chto sootvetstvyet kirilice i rysski tekst dolzzen bil otobrazzatsia korektno 
//odnako pri vizove java RazborKodirovki.java (t.e. bez koompiliacii) programma xot i
//zapyskalas korrektno no vidovala "kozibri" vmesto rysskogo.
//pri vizove koompiliatora javac RazborKodirovki.java vidovala oshibky 
//unmappable character (0x81) for encoding windows-1252. T.e. kodirovka sistemi 1251
//a konsol (c.p.) rabotaet s 1252 !!!
//Reshenie: javac -encoding utf8 <--указывает javac-y на кодировку исходного файла.
//koompiliaciia proxodit yspeshno i koompiliryet .class korektno, pri zapyske po 
//komande java RazborKodirovki rysskie simvoli otobrozzaytsia korektno
//fishka v tom chto bez raznici kakaia kodirovka ystonovlena v sisteme v momente, ona otlichaet-
//sia ot toi v kotoroi rabotaet koompiliator(1252) poetomy koompiliatory nyzzno "skazat" kodi-
//ryi v takoi-to kodirovke.
public class RazborKodirovki {
    public static void main(String[] args) {
	System.out.println((int)'o'+" "+(int)'k'+" "+(int)'U');
	System.out.println("Русский текст");
	}
}