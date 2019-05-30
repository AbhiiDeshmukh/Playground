import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      int count=1;
      for(int i=1;i<=val;i++){
      	for(int j=1;j<=val;j++){
        	if(i%2==1){
            	if(j<val){
                	System.out.print(count);
                }
              	else{
                  	count++;
                	System.out.print(count);
                }
            }
          	if(i%2==0){
            	if(j==1){
                  	count++;
                	System.out.print(count);
                  	count--;
                }
              else{
                System.out.print(count);
                if(j==val)
                  count++;
              }
                  
            }
          
        }
        System.out.print("\n");
      }
	}
}