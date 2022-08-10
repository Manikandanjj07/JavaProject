
public class testtt {
public void fc()
{
	long fac = 1l;
	
	
	for(int i = 1 ; i<=5; i++){
		
		fac= fac*i;
	}
	System.out.println(fac);
}


public void fib()
{
	int a=0;
	int b=1;
	int c =0 ;
	
	for(int i=1 ;i<=10;i++){
		
		c =a+b;	System.out.println(c);

		
		a=b;b=c;
		
		
	}
}
	
	public void sn()
	{
		int a=5 ;
		int b =6 ;
		int c;
a= a+b;
b=a-b;
a=a-b;
System.out.println(a+"  "+b);


c=a;
a=b;
b=c;

System.out.println(a+"  "+b);



	}


	public void rn () 
	{
		 long li = 1234577l;
		 String vf = String.valueOf(li);
		 System.out.println(vf);
		 
	//System.out.println(vf.charAt(6));

		 for(int i=6; i<vf.length();i--){
			 
			 System.out.print(vf.charAt(i));
			 if(i==0)
			 {
				 break;
			 }
		 }
			System.out.println(); 
		 int a =1234567;
		 int i =0, j =0;
		 
		 while(a>0)
		 {
			 i = a%10;
			 j=(j*10)+i;
			 a=a/10;
			 }
		 System.out.print(" "+j);
		}	
	public void an(){
				int n=1000;
				System.out.println();
		for(int k =1; k<=n;k++){
			
			int a=k,j=0,i=0;
			while(a>0){
				i=a%10;
				j=j+(i*i*i);
				a=a/10;
			}
			if(k==j){
				System.out.print(" "+j);	
			}}}
	public void arac(){
		int a[]={35,68,23,45,122,999,1};
		int temp;
		for(int i = 0 ; i<a.length; i++){
						for(int j =i+1; j<a.length; j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}			
			}
					}
		System.out.println("acending");
		for(int k =0 ; k<a.length;k++){
					System.out.print(" "+a[k]);
		}
	
	System.out.println("deceding");
	for(int l =a.length-1; l>=0;l--){
		System.out.print(" "+a[l]);
		}
		}
public static void main(String[] args) throws Exception{
	
	int s [] = {1,2,3,4,5,6,7,8,9,0};
		
	int len =s.length/2;
	
	for (int i=len-1; i>=0;i--)
	{
System.out.println(s[i]);
		
		
	}
	
	
	for(int j =s.length-1; j>=len;j--){
		System.out.println(s[j]);
	}
			{
		
			}
	
	testtt t = new testtt();
	t.fc();
	t.fib();
	t.sn();
	t.rn();
	t.arac();
t.an();	
}
}