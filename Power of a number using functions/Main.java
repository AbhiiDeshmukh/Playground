import java.util.Scanner;
class Main{
	public static int power(int b,int e){
    	int val=1;
      	for(int i=1;i<=e;i++){
        	val=val*b;
        }
      	return val;
    }
	
  	public static void main(String args[]){
    
    	Scanner in = new Scanner(System.in);
      	int b=in.nextInt();
      	int e=in.nextInt();
      	System.out.println(power(b,e));
    }

}