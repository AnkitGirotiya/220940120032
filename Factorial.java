	import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		       Scanner sc = new Scanner(System.in);
		     int i;
		    int fact=1;  
		     int number=sc.nextInt();    
		     for(i=1;i<=number;i++){    
		         fact=fact*i;    
		    }    
		        System.out.println("Factorial of "+number+" is: "+fact);

		    }
		
}
