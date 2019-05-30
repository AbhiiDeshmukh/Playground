import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      char ch=in.next().charAt(0);
      int key=in.nextInt();
      int val=0;
      //System.out.println(ch+" "+key);
      val=(ch-key);
      if(ch>='a' && ch<='z')
      	if(val<97)
        val=(val+26);
      else 
        if(val<65)
        	val+=26;
        
      
      //System.out.println(val);
      ch=(char)val;
      System.out.println(ch);
    }
}