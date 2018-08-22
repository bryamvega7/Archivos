
package archivos;

import java.util.Scanner;

public class Impares
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int n=leer.nextInt();
        for (int i=0;i<=n;i++)
        {
            if((i%2)!=0)
            {
                System.out.println(i);
            }
        }
    } 
}