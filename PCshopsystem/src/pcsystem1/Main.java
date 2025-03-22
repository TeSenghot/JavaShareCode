package pcsystem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      //Create a shop and add Computer to its inventory
	    Shop shop= new Shop();
	    shop.addComputer(new Computer("Dell","XPS 13",1200.00));
	    shop.addComputer(new Computer("Apple","Macbook Pro",2500.00));
	    shop.addComputer(new Computer("HP","Envy",900.00));
	    
	    
	    //Create computer name who buying the computer
	    Customer customer= new Customer("Dara");
	    
	    //Create available computers in the shop
	    System.out.println("Welcome to the computer Shop!");
	    shop.listComputers();
	    
	    //Sell computers to the customer
	    shop.sellComputer(customer,0);
	    //Sell the first Computer(Dell, XPS 13,1200$)
	    
	    shop.sellComputer(customer,1);
	    //Sell the second Computer(HP, Envy,900$)
	    
	    //Display the recipet for the customer
	    customer.displayReceipt();
		
	}

}
