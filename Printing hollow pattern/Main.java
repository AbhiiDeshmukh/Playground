import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      for(int i=0;i<val;i++){
      	for(int j=0;j<val;j++){
        	if(i==0 || i==(val-1))
              System.out.print("*");
          	else if(j==0 || j==val-1)
              System.out.print("*");
            else
              System.out.print(" ");
              
        }
        System.out.print("\n");
      }
	}
}