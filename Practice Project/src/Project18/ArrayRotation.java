package Project18;
import java.util.*;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int k=5;;
		rotate(arr,k);
		System.out.println(Arrays.toString(arr));

	}
	public static void rotate(int arr[],int k) {
		if(k<0 |k>arr.length ) {
			return;
		}
		for(int i=0;i<k;i++){
			Rightrotate(arr,k);
		}
	}
	public static void Rightrotate(int arr[],int k) {
		int temp;
	    int last = arr[arr.length - 1];
	    for (int i = arr.length - 2; i >= 0; i--) {
	            arr[i + 1] = arr[i];
	        }
	 
	        arr[0] = last;
	}

}
