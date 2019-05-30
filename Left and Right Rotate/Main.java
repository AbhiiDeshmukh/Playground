import java.util.Scanner;
class Main 
{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int sz=in.nextInt();
    int a[]=new int[sz];
    int b[]=new int[sz];
    for(int i=0;i<sz;i++){
      a[i]=in.nextInt();
      b[i]=a[i];
    }
    int rot=in.nextInt();
    int val=0;
    int rot1=rot,temp=0;
    
    while(rot1>0){
    	if(sz%2==0)
          val=sz-2;
      	else
          val=sz-1;
      	temp=a[val];
      	for(int i=val;i>=2;i--){
        	a[i]=a[i-2];
        }
      	a[0]=temp;
    
      rot1--;
    }
    
    while(rot>0){
      	temp=b[1];
      	if(sz%2==0)
          val=sz-1;
      	else
          val=sz-2;
      	//System.out.println(temp);
    	for(int i=1;i<=val-2;i+=2){
        	b[i]=b[i+2];
        }
    	b[val]=temp;
      
      rot--;
    }
    
    for(int i=0;i<sz;i++){
      if(i%2==0)
        b[i]=a[i];
      System.out.print(b[i]+" ");
    }
  	}
}