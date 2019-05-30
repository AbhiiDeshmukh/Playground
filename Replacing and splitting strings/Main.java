import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      int sp=in.nextInt();
      
      for(int i=0;i<str2.length();i++){
      	if(str2.charAt(i)!=' '){
        	System.out.print(str2.charAt(i));
        }else
          System.out.println();
      }
      
      
    }
}