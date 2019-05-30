public class Main {
	public static void main(String[] args) {
		Customers c1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jun-1990","F","Lakeme Kajal, Salwar");
      	Customers c2 = new Customers(7008,"Rahul",9000000001l,"Chennai","27-Jan-1992","M","T-Shirt, Jeans");
      	Suppliers s1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
      	Suppliers s2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7,"Unpaid",4.35f);
      
      	c1.displayProfileDetails(1);
      	c2.displayProfileDetails(1);
      	s1.displayProfileDetails(1);
      	s2.displayProfileDetails(1);
      
      	c1.displayProfileDetails(2);
      	c1.editAddress("Coimbatore");
      	c1.displayProfileDetails(2);
      	s1.displayProfileDetails(2);
      	s1.editAddress("Delhi");
      	s1.displayProfileDetails(2);
      
      	c1.placeOrder();
      	s1.increaseStockLevel(5);
      	s2.increaseStockLevel(10);
      	s1.displayProfileDetails(3);
      	s2.displayProfileDetails(3);
    }	
}

class Users {
	/*int id;
  	String name;
  	long mobno;
  	*/
  
  	
}

class Customers extends Users{
  	int id;
  	String name;
  	long mobno;
	String shipAdd;
  	String dob;
  	String gender;
  	String ordhis;
  
  	public Customers(int id,String name,long mobno,	String shipAdd,String dob,String gender,String ordhis){
      this.id=id;
      this.name=name;
      this.mobno=mobno;
      this.shipAdd=shipAdd;
      this.dob=dob;
      this.gender=gender;
      this.ordhis=ordhis;    
    }
  
  	public void editAddress(String shipAdd){
    	this.shipAdd=shipAdd;
    }
  	public void placeOrder(){
    	System.out.println("Order placed successfully!");
    }
  	public void displayProfileDetails(int a){
      if(a==1)
    	System.out.println(name+", "+this.mobno);
      if(a==2)
        System.out.println(name+", "+this.shipAdd);
    }
}

class Suppliers extends Users {
  	int id;
  	String name;
  	long mobno;
	String billAdd;
  	int itemstk;
  	String paystatus;
  	float frate;
  
  	public Suppliers(int id,String name,long mobno,String billAdd,int itemstk,String paystatus,float frate){
      this.id=id;
      this.name=name;
      this.mobno=mobno;
      this.billAdd=billAdd;
      this.itemstk=itemstk;
      this.paystatus=paystatus;
      this.frate=frate;
    
    }
  
  	public void editAddress(String billAdd){
    	this.billAdd=billAdd;
    }
  	public void increaseStockLevel(int stock){
    	this.itemstk+=stock;
    }
  	public void displayProfileDetails(int a){
      if(a==1)
    	System.out.println(name+", "+this.mobno);
      if(a==2)
        System.out.println(name+", "+this.billAdd);
      if(a==3)
        System.out.println(name+", "+this.itemstk);
    }
}