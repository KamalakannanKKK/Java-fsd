package Project19;

import java.util.*;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6,7,8,91,9,40};
		selectionsort.sort(arr);
		System.out.println("enter the element to search");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		bsearch(arr,k);
		

	}
	public static void bsearch(int arr[],int k) {
		int start=0;
		int end=arr.length-1;
		int mid;
		boolean flag=false;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==k) {flag=true;break;}
			else if (arr[mid]<k) start=mid+1;
			else end=mid-1;
		}
		if(flag==true)System.out.println("Element is found");
		else System.out.println("Element is not found");
	}

}
