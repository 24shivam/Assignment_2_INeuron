import java.util.Scanner;

class QuickSort {

	
	 void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	 int partition(int[] arr, int low, int high)
	{

		// pivot
		int pivot = arr[high];

		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) 
		{

			if (arr[j] < pivot)
			{

				// Increment index of
				// smaller element
				i++;
				swap(arr, i, j);
			}
		}
		
		swap(arr, i + 1, high);
		return (i + 1);
	}

	
	 void quickSort(int[] arr, int low, int high)
	{
		if (low < high)
		{

			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	



	public static void main(String[] args)
	{
//Taking arrays as input from user 
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of array");
		
		int n=scan.nextInt();
		int []arr=new int[n];
		System.out.println("ENTER THE ELEMENTS OF ARRAY");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		
		

//creating object of quick sort class
		QuickSort q1=new QuickSort();
		
//calling the method
		q1.quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");

// Function to print an array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
}


