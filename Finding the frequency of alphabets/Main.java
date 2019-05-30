import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int a[] = new int[26];
      int len = str.length();
      for(int i=0;i<len;i++){
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
      		a[str.charAt(i)-'a']++;
        else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
          a[str.charAt(i)-'A']++;
      }
      str=str.toLowerCase();
      for(int i=0;i<len;i++){
        int offset=str.charAt(i)-97;
        if(a[offset]!=0){
          System.out.print(str.charAt(i));
          System.out.print(a[offset]+" ");
          a[offset]=0;
        }
 
      }
    }
}