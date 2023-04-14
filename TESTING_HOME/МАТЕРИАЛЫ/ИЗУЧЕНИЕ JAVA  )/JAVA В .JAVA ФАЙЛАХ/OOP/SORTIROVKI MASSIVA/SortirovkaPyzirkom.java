//при большом числе элементов в массиве данная сортировка неэффективна
//так-как много проходок по массиву(для сортировки одного значения
//требуется одна прходка), сколько элементов в массиве столько нужно проходок
//а если в массиве 1000 элементов? неэфективно...
public class SortirovkaPyzirkom { 
	public static void main ( String args[] ) { 
	int array[]={12,43,65,23,56,45,78,23,2,67,2332,4,3,};
	for(int i=0;i<array.length;i++){
		System.out.print(array[i]+" ");
	}
	System.out.println();
	
	for(int i=1;i<array.length;i++){
		for(int a=0;a<array.length-1;a++){
			if(array[a]>array[a+1]){
				int temp=array[a+1];
				array[a+1]=array[a];
				array[a]=temp;
			}
		}
	}
	for(int i=0;i<array.length;i++){
		System.out.print(array[i]+" ");
	}
	
	
	}
}