package Project19;
import java.util.*;
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,34,4,5,6};
		System.out.println("enter the element to search");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		search(arr,k);

	}
	public static void search(int arr[],int k) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i]) {
				flag=true;
			}
		}
		if(flag==true)System.out.println("Element is found");
		else System.out.println("Element is not found");
	}

}
