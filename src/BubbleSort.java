import java.util.Scanner;
import java.util.*;
public class BubbleSort {

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
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++) 
			{
				if(arr[j]< arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
		}
		System.out.println("the sorted array are as => ");
		for(int elem:arr) {
			System.out.print(elem+ " ");
		}


	}

}
