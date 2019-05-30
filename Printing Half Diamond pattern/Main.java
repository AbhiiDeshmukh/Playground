import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      for(int i=1;i<=val;i++){
      	for(int j=1;j<=val-i;j++){
        	System.out.print(" ");
        }
        for(int j=1;j<=i+(i-1);j++){
        	System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}