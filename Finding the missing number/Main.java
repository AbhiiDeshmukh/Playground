import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int a[] = new int[n];
      
      	for(int i=0;i<n;i++){
        	int tem=in.nextInt();
          	a[tem-1]=tem;
        }
      
      	for(int i=0;i<n;i++){
        	if(a[i]==0)
              System.out.println(i+1);
        }
    }
}