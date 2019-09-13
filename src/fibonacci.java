
public class fibonacci {
	 
		public static void main(String[] args) 
		{
			//da fibonacci serien hurtigt kommer over 31-bit, skal vi bruge #long og ikke #int
			long n1=0,n2=1,n3,antal=49;
				System.out.print("1");
		        for (long i = 1; i <= antal; ++i)
		        {
		        	n3=n1+n2;
		            System.out.print(" "+n3);
		            n1=n2;
		            n2=n3;


		        }
	 
		}
	 
	}
