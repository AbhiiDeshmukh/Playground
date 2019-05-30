import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
  		int val = in.nextInt();
      
      	for(int i=1;i<=val;i++){
        	for(int j=0;j<val;j++){
              System.out.print(i);
            }
          System.out.print("\n");
        }
	}
}