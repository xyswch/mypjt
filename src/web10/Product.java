package web10;

public class Product {
	private int id;
	private String pName;
	private String origin;
	private double price;
	private int inventory;
	
	public Product(){
		this.id=0;
		this.pName="";
		this.origin="";
		this.price=0.0;
		this.inventory=0;
	}
	
	public Product(int id,String pName,String origin,double price,int inventory){
		this.id=id;
		this.pName=pName;
		this.origin=origin;
		this.price=price;
		this.inventory=inventory;
	}
	
	public Product(String pName,String origin, double price, int inventory) {
		this.pName = pName;
		this.origin = origin;
		this.price = price;
		this.inventory = inventory;
	}
	
	public int getId() {
		return this.id;
	}
	public String getPName() {
		return this.pName;
	}
	public String getOrigin() {
		return this.origin;
	}
	public double getPrice() {
		return this.price;
	}
	public int getInventory() {
		return this.inventory;
	}
}