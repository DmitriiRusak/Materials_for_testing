public class VehicleDemo { 
	public static void main ( String args[] ) { 
		Vehicle minivan=new Vehicle ();
		int range;
		
		minivan.passengers=7;
		minivan.fuelcap=16;
		minivan.mpg=21;
		
		Vehicle sportCar=new Vehicle();
		sportCar.passengers=2;
		sportCar.fuelcap=14;
		sportCar.mpg=19;
		 
		System.out.println("Minifyrgon mozzet perevezti "+minivan.passengers+
			" passazzirov na rasstoianie ");
		minivan.range();
		
		System.out.println("SportCar mozzet perevezti "+sportCar.passengers+
			" passazzirov na rasstoianie ");
		sportCar.range();
	}
}
/*esli sozdar Vehicle minivan=new Vehicle (); sozdaem odin ob`ekt s pomoschy new()
*a potom zdelac Vehicle sportCar=minivan; to mi ne sozdaem esche odin ob`ekt,
*mi sozdaem esche odny ssilky na vse tot zze ob`ekt sozdanni operatorom
* new. t.e. y nas seichas 2 ssilki na 1 ob`ekt i vnosia izmeneniia cherez odny
* a potom prosmatrivaia po drygoi ssilke cherez System... mi yvidim odinakovie 
*dannie. Ob`ekt to y nas odin, no meniat(vidoizmeniat) mozzno cherez lybyy ssilky.
*peremennie: minivan i sportCar ssilaytsia na odin i tot-zze ob`ekt.
*/