import java.util.Arrays;
public class SortirovkaStringArray {
    public static void main(String[] args) {
		String strArray[]={"privet", "java", "Polimorfizm", "Nasledovanie", "pobitovie_operatori", "progrommist"};
		
		for(int i=0;i<strArray.length;i++){
		String temp="";
			if(strArray[i].length() > strArray[i++].length()){
				temp=strArray[i++];
				strArray[i++]=strArray[i];
				strArray[i]=temp;
			}
		}
		System.out.println(Arrays.toString(strArray));
	
	
	}
}
	