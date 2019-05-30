import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int a[]=new int[n];
      int b[]=new int[k];
      
      for(int i=0;i<n;i++){
      	a[i]=in.nextInt();
        b[a[i]-1]+=1;
      }
      for(int i=0;i<k;i++){
      	System.out.println((i+1)+" "+b[i]);
      }
    }
}