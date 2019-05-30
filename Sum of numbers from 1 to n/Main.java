import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      	int val = in.nextInt();
      	int sum=0; 
      	for(int i=1;i<=val;i++){
          	sum+=i;
            
        }
      	  System.out.println(sum);
	}
}