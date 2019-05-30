import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = new String("");
      int len=str1.length();
      for(int i=len-1;i>=0;i--){
      	str2=str2+str1.charAt(i);
        
      }
      
      if(str2.equals(str1)){
      	System.out.println("Yes");
      }
      else{
      	System.out.println("No");
      }
    } 
}