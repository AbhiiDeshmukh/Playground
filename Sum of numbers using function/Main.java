import java.util.Scanner;
class Main{
  
  	public static int sum_fact(int a){
      	int sum = 0;
    	for(int i=1;i<=a;i++){
        	sum+=i;
        }
    	return sum;
    }	
  
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      	int val = in.nextInt();
      	System.out.println(sum_fact(val));
	}
}