import java.util.Scanner;
class Main{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
  	int val=in.nextInt();
  	int d2=0,d1=0;
  	while(val>0){
     d1=val/10;
     if(val/100==0 && val/10!=0)
     	d2=val%10; 
     val=val/10;
    
    }
	System.out.println(d2);

}

}