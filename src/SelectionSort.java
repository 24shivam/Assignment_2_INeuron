import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of Array=>");
		int n=scan.nextInt();
		int [] arr=new int [n] ;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the array element at "+ i);
			arr[i]=scan.nextInt();
		}
		System.out.println("the array given by you as =>");
		for(int elem:arr) {
			System.out.print( elem +" ");
		}
		System.out.println();
		
		
		
		for(int i=0;i<arr.length-1;i++) 
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++ ) {
				if(arr[smallest] > arr[j]) 
				{
					smallest=j;
					
				}
		}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;

		}
		System.out.println("the sorted array are as => ");
		for(int ar:arr) {
			System.out.print(ar+" ");
//			System.out.println();
		}
	}
}
