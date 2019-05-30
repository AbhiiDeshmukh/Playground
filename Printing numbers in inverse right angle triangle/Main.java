import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      for(int i=val;i>0;i--){
      	for(int j=i;j>0;j--){
        	System.out.print(j);
        }
        System.out.print("\n");
      }
	}
}