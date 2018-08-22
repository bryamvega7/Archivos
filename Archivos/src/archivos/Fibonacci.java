
package archivos;

import java.util.Scanner;

public class Fibonacci
{
    public static void main (String [] args)
    {   
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int n=leer.nextInt();
        int f1=1, f2=1;
	System.out.println (f1);
	while (f1<n)
	{
		System.out.println(f2);
		f2+=f1;			
		f1 = f2 - f1;
	} 
    }
}