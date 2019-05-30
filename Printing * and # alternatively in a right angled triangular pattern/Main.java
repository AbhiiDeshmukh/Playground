import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int val = in.nextInt();
      	int count=1;
      	for(int i=0;i<val;i++){
        	for(int j=0;j<=i;j++){
            	if(count%2==0)
                  System.out.print("#");
              	else
                  System.out.print("*");
              count++;
            }
          System.out.print("\n");
        }
    }
}