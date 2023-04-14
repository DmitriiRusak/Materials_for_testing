public class ReturnStatment{
	
//Существуют две разновидности инструкции return: одна - для методов типа void, 
//не возвращающих значений, а другая - для методов, возвращающих значение
//вызывающей части программы.
	
	static void method1(){
		for(int i=0;i<10;i++){
			if(i==5){
				System.out.println("srabotal return statment v void");
				return;
			}
		}
	}
	static String method2 (){
		String str="spec. infa";
		return str;
	}
	
	static boolean isIven(int x){//zdes x eto parametr
		if(x%2==0){
			return true;
		}
		else return false;
	}
	public static void main(String args[]){
		method1();
		//String zapros = method2();
		System.out.println(method2());//<-prikolno, znachenie nenado derzzat void
											//v peremennoi
											
		System.out.println(isIven(5)); //zdes 5 eto argyment

//При вызове метода ему можно передать одно или несколько значений. Значение, 
//передаваемое методу, называется аргументом, тогда как переменная, 
//получающая аргумент, называется параметром.
//Параметры объявляются в скобках после и мени метода. Синтаксис 
//объявления параметров такой же, как и у переменных. Областью действия 
//параметров является тело метода.















	}
}