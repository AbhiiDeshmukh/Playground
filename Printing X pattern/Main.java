import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      int sp2=val-2;
      int sp1=0;
      for(int i=0;i<val;i++){
          	for(int k=0;k<sp1;k++){
            	System.out.print(" ");
            }
            System.out.print("*");
          	for(int k=0;k<sp2;k++)
              System.out.print(" ");
            if(i!=(val/2))
          	    System.out.print("*");
        	if(i<(val/2)){
            	sp1++;
              	sp2-=2;
            }
            if(i==val/2){
               sp1--;
               sp2+=2;
            }
                
        	if(i>(val/2)){
            	sp1--;
              	sp2+=2;
            }
              
      		System.out.print("\n");
        }
	}
}