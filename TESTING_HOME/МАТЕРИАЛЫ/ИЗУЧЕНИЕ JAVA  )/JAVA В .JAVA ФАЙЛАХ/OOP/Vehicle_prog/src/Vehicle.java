public class Vehicle { 
	int passengers;
	int fuelcap;
	int mpg;
	
	//метод range () не возвращает вызывающей части программы никаких данных.
	void range(){
		System.out.println("Dalnost poezdki avto "+fuelcap*mpg+" mil");
	}
}