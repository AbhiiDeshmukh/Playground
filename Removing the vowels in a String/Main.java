import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb= new StringBuilder("");
    
    for(int i=0;i<str.length();i++){
    	if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        	
        }else{
        	sb.append(str.charAt(i));
        }
    }
    System.out.println(sb);
  }
}