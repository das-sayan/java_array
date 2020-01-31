import java.util.Scanner;
class array1{
	public static void main(String arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size..");
		int size= sc.nextInt();
		int a[]=new int[size+10];
		int sum=0,i;
		System.out.println("enter elements..");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(a[2]);
		
		if(size>=3)
			System.out.println(a[3]);
		if(size>=5)
			System.out.println(a[5]);
		if(size>=7)
			System.out.println(a[7]);
		if(size>=11)
			System.out.println(a[11]);
		sum= a[2]+ a[3]+ a[5]+ a[7] + a[11];
		
		for(i=12;i<=size;i++)
		{
			if((i%2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0) && (i%11!=0))
			{
				sum=sum + a[i];
			}
		}
		
		System.out.println("Result= "+sum);
		
		
}}
