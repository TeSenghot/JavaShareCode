package sumofoddevenelement;

import java.util.Arrays;
import java.util.Scanner;

public class sumofoddevenelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[5]; int sum=0, sum1=0;
		System.out.println("Enter Array Element:");
		for (int i=0; i<5; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Arr:"+Arrays.toString(arr));	
		System.out.print("Odd Element:");
		for (int i = 0; i<5; i++) {
			if (arr[i]%2 !=0) {
				System.out.print(" "+arr[i]);
				sum+=arr[i];
			}
			
		}
		System.out.println("");
		System.out.println("Enter Array Element:");
		Scanner sc1 = new Scanner (System.in);
		int arr1[] = new int [5];
		for (int i= 0; i<5; i++) {
			arr1[i]= sc1.nextInt();
		}
		System.out.println("The Array[]:"+Arrays.toString(arr1));
		System.out.print("Even Array Element:");
		for (int num : arr1) {
			if (num%2 ==0) {
				System.out.print(" "+num);
				sum1+=num;
			}
		}
		System.out.println("");
		System.out.println("Sum of Odd element:"+sum);
		System.out.println("Sum of Even element:"+sum1);
			}
		}
