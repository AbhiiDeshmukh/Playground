import java.util.*;

class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price){
  	this.price=price;
    //System.out.println(""+this.price);
  }
  public int getPrice(){
  	return this.price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  
  public void setProduct(String product){
  	this.product=product;
  }
  public String getProduct(){
  	return this.product;
  }
  public void setquantity(int quantity){
  	this.quantity=quantity;
    //System.out.println(""+this.quantity);
  }
  public int getquantity(){
  	return this.quantity;
  }
}

class Bill extends Customer
{
  public void total(int a,int b){
  	System.out.println("Total Price is : "+(int)a*b);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String pro=in.nextLine();
    int prz=in.nextInt();
    int qua=in.nextInt();
    
    Item i = new Item();
    i.setPrice(prz);
    int a=i.getPrice();
    
    Customer c = new Customer();
    c.setquantity(qua);
    int b=c.getquantity();
    
    Bill obj = new Bill();
    obj.total(a,b);
  }
}