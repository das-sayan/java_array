import java.util.Scanner;
class array4{
	public static void main(String arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size..");
		int size= sc.nextInt();
		int a[]=new int[size];
		int sum=0,i;
		System.out.println("enter elements..");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++){
			if(i%2!=0)
			{
				sum=sum +  (a[i]*i);
			}
		}
		System.out.println("Result= "+sum);
		
		
}}