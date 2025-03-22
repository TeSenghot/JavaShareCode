package Tester;
import java.util.Scanner;
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		testing1 c1= new testing1("Volvo","XC40","2018","Sweden");
		testing1 c2= new testing1("VW","Golf GTI","2007","Germany");
		testing1 c3= new testing1("BMW","M3 E46","2007","Germany");
		
		System.out.println("ទិន្នន័យរថយន្តក្នុងស្តុកៈ");
		System.out.println("Brand     Model    Year      Manufacturer\n");
		c1.disp();
		c2.disp();
		c3.disp();
		
		
		System.out.println("\nEnter your Order:");
		String[] myarr= new String[3];
		System.out.print("Enter the Brand:");
		myarr[0] = scan.nextLine();
		System.out.print("Enter the Model:");
		myarr[1] = scan.nextLine();
		System.out.println("Enter the Year:");
		myarr[2] = scan.nextLine();
		scan.close();
		System.out.println("Thank you!! Your Order:");
		System.out.println("Brand:"+myarr[0]+"\tModel:"+myarr[1]+"\tYear:"+myarr[2]);
		}

}
