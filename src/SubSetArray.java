import java.util.*;
class SubSetArray {

	
	static boolean isSubset(int arr1[], int arr2[], int m,
							int n)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) 
		{
			for (j = 0; j < m; j++) 
			{
				if (arr2[i] == arr1[j])
					break;
			}		
			if (j == m)
				return false;
		}
		
		return true;
	}

	
	public static void main(String args[])
	{
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter  the size  of array1");
		int n1=scan.nextInt();
		int []arr1=new int [n1];
		System.out.println("Enter  the element  of array1");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("enter the element "+ i);
			arr1[i]=scan.nextInt();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
//		TAKING USER INPUT FROM USER IN ARRAY==>2
		System.out.println("Enter  the size  of array2");
		int m2=scan.nextInt();
		int []arr2=new int [m2];
		System.out.println("Enter  the element  of array2");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("enter the element "+ i);
			arr2[i]=scan.nextInt();
		}


		int m = arr1.length;
		int n = arr2.length;
		

		if (isSubset(arr1, arr2, m, n))
			System.out.print("arr2[] is "
							+ "subset of arr1[] ");
		else
			System.out.print("arr2[] is "
							+ "not a subset of arr1[]");
	}
}
