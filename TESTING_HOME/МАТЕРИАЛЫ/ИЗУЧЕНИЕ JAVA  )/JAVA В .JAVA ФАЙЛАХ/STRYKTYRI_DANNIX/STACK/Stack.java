
//Realizaciia stack! Soderzzit elementi po principy stopki tarelok, samaia pervaia bydet obslyzzena poslednei.
//T.e. first in last out.


public class Stack {
    private char array[];
    private int putLog, getLog;


    Stack(int length){
        array=new char[length];
        putLog=0;
        getLog=length-1;
    }
    /*
    *
     */
    public void push(char ch){
        if(putLog<array.length){
            array[putLog]=ch;
            putLog++;
            System.out.println("element "+ch+" pomeschen v stack");
        }
        else System.out.println("Stack polon, svobodnogo mesta net");
    }
    /*
    *
     */
    public void pop(){
        if(getLog>=0){
            System.out.print(array[getLog]+" ");
            getLog--;
        }
        else System.out.println("Stack pyst");
    }

    public static void main(String[] args) {
        Stack stack= new Stack(5);
        for(int i=0;i<6;i++){
            stack.push((char)('A'+i));		//So skobkomi nado bit v teme, legko zdelat nepravilno.
        }
        for(int i=0;i<8;i++){
            stack.pop();
        }
    }
}