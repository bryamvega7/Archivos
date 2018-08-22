
package archivos;

import java.util.Scanner;

public class Serie 
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner (System.in);
        int n;
        System.out.println("Ingrese el numero de elemenentos en serie: ");
        n=leer.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.print(i+",");
        }
    }
}