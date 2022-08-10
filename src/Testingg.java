import java.util.Scanner;
public class Testingg{
	static int j =66;
		int  m =33;
	public void fibo()
	{
			int a=1;
		int b= 0;
		int c=0;
		
		
		for ( int i =2; i<=10;i++)
		{
			
 c =a+b;

 System.out.print(c);//1 1 2 3 5 8 1 3 2 1 3 4

a=b;
b=c;	}}
	public void swap()
	{
		
		Scanner s = new Scanner(System.in);
System.out.println("emter the number to swap");
		int i = s.nextInt();
		int j = s.nextInt();

		System.out.println("NUMBERS SWAP");
		
	j=i+j;	
	i=j-i;
	j=j-i;

		System.out.print(i +"  "+j);
			
	}
	 public void odd()
	 {
			int q = 100; 
			int c=0;
			int d = 0 ;
			
			for( int i =1; i<=q; i++)
			{
					
				if (i%2==0)
				{
					System.out.println(i);
					c=c+1;
					d=d+i;
				}
			}
			System.out.println(c);
			System.out.println(d);
	 }
	public static void facti ()
	{
		Scanner fact = new Scanner(System.in );
		
	System.out.println("enter the number");
		
	long f =fact.nextLong();
	long count=1;
		for (int i = 1 ; i<=f; i++)
		{
			count = count*i;
		
		}
		 
		System.out.println("factoril   "+ count);
			
	}
	
	
	
	public void fib (){
		int a =1,b=0,c=0,d=0;
		for(int i =2; i<=10;i++){
			c = a+b;
			
			System.out.println(c);
			a=b;
					b=c;
		d=d+c;	
		}
		System.out.println(d);
		
	}
	
	
	
	
	public void reverse (){
		System.out.println("enter");
		Scanner r = new Scanner(System.in);
		int a =r.nextInt();
		int a1=a;
		int   i=0, j=0;
		
		while (a>0)
		{
			
			i = a%10;   //  2 1
  			System.out.print(i); // 2 1  
			 		j=(j*10)+i; //   2 1
			a= a/10;//
					
		
		}
		
		System.out.println("           "+j);
		
		if(j==a1)
		{
			System.out.println("palindrome141");
		}
		
		else{
			System.out.println("np");
		}
		
	}
	public static void main (String [] args)
	{
		
		
		List 
		Testingg t = new Testingg();
		
		
		String s1 = "java,selenium,Test,mavan";
		
		String s2[]= s1.split(",");
		System.out.println(s2[0]+ s2[1]); 
		String s3 ="hi";
		String s4 =s3.concat(s1).concat(s2[0]);
		System.out.println(s4);
		
		t.reverse();
		//t.fib();
		
		//t.swap();
//t.odd();
		//facti();
		//System.out.println(j);

	}
	
	
}