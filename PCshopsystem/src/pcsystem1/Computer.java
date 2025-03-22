package pcsystem1;

import java.util.ArrayList;
import java.util.List;

public class Computer {

	private String brand;
	private String model;
	private Double price;

	//brand:Apple,Model:Macbook Pro,Price:1400$
	public Computer(String brand,String model, Double price) {
		
	  this.brand=brand;
	  this.model=model;
	  this.price=price;
	}
	public double getPrice() {
	  return price;
	}
	public void displayDetails() {
	  System.out.printf("Brand:%s,Model:%s,Price:$%.2f%n",brand,model,price);
	}
	}
	class Customer{
	  private String name;
	  private List<Computer>purchasedComputers;
	  
	  public Customer(String name) {
	    this.name=name;
	    this.purchasedComputers=new ArrayList<>();
	  }
	  public void buyComputer(Computer computer) {
	    purchasedComputers.add(computer);
	  }
	  public void displayReceipt() {
	    System.out.println(name+" purchased: ");
	    double total=0.0;
	    for(Computer computer:purchasedComputers) {
	      computer.displayDetails();
	      total+=computer.getPrice();
	    }
	    System.out.printf("Total Amount:$%.2f%n",total);
	  }
	}
	class Shop{
	  private List<Computer>computers;
	  
	  public Shop() {
	  computers=new ArrayList<>(); 
	}
	  public void addComputer(Computer computer) {
	    computers.add(computer);
	  }
	  
	  public void listComputers() {
	    System.out.println("Available Computers:");
	    for(int i=0;i<computers.size();i++) {
	      System.out.print((i+1)+". ");
	      
	      computers.get(i).displayDetails();
	    }
	    
	  }
	  public void sellComputer(Customer customer,int index) {
	    if(index>=0 && index<computers.size()) {
	      customer.buyComputer(computers.get(index));
	      computers.remove(index);
	      
	    }else {
	      System.out.println("Invalid computer selection.");
	    }
	  }
	
}
