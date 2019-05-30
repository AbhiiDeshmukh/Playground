import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      int fact=1;
      for(int i=1;i<=val;i++){
      	fact*=i;
      }
      System.out.println(fact);
	}
}