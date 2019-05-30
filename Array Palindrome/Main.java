import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      	int aLen=in.nextInt();
      	int a[]=new int[aLen];
      	for(int i=0;i<aLen;i++){
        	a[i]=in.nextInt();
        }
      	int count=0;
      	int sz=(aLen%2==0)?(aLen/2):((aLen/2)+1);
      	for(int i=0;i<sz;i++){
        	if(a[i]!=a[aLen-1-i]){
            	break;
            }else{
            	count++;
            }
        }
      
      	if(count==(aLen/2)){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}