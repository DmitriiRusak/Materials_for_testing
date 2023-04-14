public class Queue {
	
	private char q [];
	private int putlog,getlog;

	Queue(int qLenth){
		q=new char[qLenth];
		putlog=getlog=0;
	}

	void put(char ch){
		if(putlog==q.length){
			System.out.println(" OCHERED ZAPOLNENA");
			return;
		}
		q[putlog++]=ch;
	}
	
	char get(){
		if(getlog==putlog){
			System.out.println("OCHERED PUSTA");
			return (char) 0;
		}
		
		return q[getlog++];
	}

}