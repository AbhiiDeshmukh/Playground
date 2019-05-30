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
      for(int i=0;i<26;i++){
      	if(a[i]==0){
          	char out = (char)(i+97);
       		System.out.print(out+" ");
        }
      }
      
    }
}