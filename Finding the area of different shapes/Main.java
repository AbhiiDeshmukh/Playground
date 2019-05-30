import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int val=in.nextInt();
      
      switch(val){
        case 1:
          int sd=in.nextInt();
          System.out.println(sd*sd);
          break;
        case 2:
          int ln=in.nextInt();
      	  int bd=in.nextInt();
          System.out.println(ln*bd);
          break;
        case 3:
          int bs=in.nextInt();
      	  int ht=in.nextInt();
          System.out.println(0.5*bs*ht);
          break;
        case 4:
          int rd=in.nextInt();
          System.out.println(3.14*rd*rd);
          break;
        default:
          System.out.println("Invalid value");
      }    
    }
}