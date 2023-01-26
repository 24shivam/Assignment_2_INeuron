import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		
		int n=scan.nextInt();
		int []arr =new int [n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the element "+ i);
			arr[i]=scan.nextInt();
		}
		System.out.println("the array are given by you as ");
		for(int elem:arr) {
			System.out.print( elem +" ");
		}
		System.out.println();
//		int []arr= {3,5,3,2,6,7,7,8,9};
		Boolean flag=false;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
				{
					System.out.println("the duplicate value are "+ arr[j]+
							"  at index  "+ i +" and "+ j);
					flag=true;
					
				}
				
			}
			
		}
		
		if(flag==false) {
			System.out.println(" NO DUPLICATE VALUE HERE!!");
		}

	}

}
