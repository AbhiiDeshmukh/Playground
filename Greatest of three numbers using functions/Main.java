import java.util.Scanner;
class Main{
  	public static int greater(int a, int b){
    	return (a>b)? a: b;
    }
  	
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val1 = in.nextInt();
      int val2 = in.nextInt();
      int val3 = in.nextInt();
      System.out.println(greater(greater(val1,val2),val3));
	}
}