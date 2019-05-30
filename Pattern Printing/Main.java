import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int row=in.nextInt();
      int col=in.nextInt();
      
      for(int i=row;i>0;i--){
      	for(int j=col;j>0;j--){
          if(j<=i)
        	System.out.print(i);
          else
            System.out.print(j);
        }
        System.out.println();
      }
    }
}