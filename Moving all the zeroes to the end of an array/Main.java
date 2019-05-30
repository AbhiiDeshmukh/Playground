import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int sz=in.nextInt();
      int a[]=new int[sz];
      int b[]=new int[sz];
      int count=0,j=0;
      for(int i=0;i<sz;i++){
      	a[i]=in.nextInt();
      	if(a[i]==0)
          count++;
        else{
          b[j]=a[i];
          j++;
        }
      }
      j=0;
      for(int i=0;i<sz;i++){
      	if(i<sz-count){
          a[i]=b[j];
          j++;
        }
        else
          a[i]=0;
      }
      for(int i=0;i<sz;i++)
        System.out.print(a[i]+" ");
      
    }
}