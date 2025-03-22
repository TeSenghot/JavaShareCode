package package1;
import java.util.Scanner;
public class reversedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int rev=0;
int rem=0;
//int a=num;
System.out.println("Enter the digit of number:");
int num=sc.nextInt();
while (num>0) {
	rem=num%10;
	rev=rev*10+rem;
	num/=10;
}
System.out.println("Reverse Digits:"+rem);
	}

}
