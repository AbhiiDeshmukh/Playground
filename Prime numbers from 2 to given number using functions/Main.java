import java.util.Scanner;
class Main{
  	public static void prime(int val){
      	int flag=1;
    	for(int i=2;i<=val;i++){
        	for(int j=2;j<i;j++){
            	if(i%j==0){
                	flag=0;
                  	break;
                }else{
                	flag=1;
                }
            }
 			if(flag==1){
            	System.out.println(i);
            }         
        }
    
    }
  
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val=in.nextInt();
      prime(val);
      
	}
}