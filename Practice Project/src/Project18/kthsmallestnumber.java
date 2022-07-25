package Project18;
import java.util.*;
public class kthsmallestnumber {
		
			
			public static int kthSmallest(Integer[] arr,
										int k)
			{
			
				Arrays.sort(arr);

				return arr[k - 1];
			}

		
			public static void main(String[] args)
			{
				Integer arr[] = new Integer[] { 12, 130, 5, 174, 19,45,23 };
				int k = 4;
				System.out.print("K'th smallest number is " + kthSmallest(arr, k));
			}
	



	}


