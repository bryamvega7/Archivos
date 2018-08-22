
package archivos;

import java.util.Scanner;

public class Sumatoria 
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el numero de elementos: ");
        int num=leer.nextInt();
        int suma=0;
        for(int i=0;i<num;i++)
        {
            suma=suma+2*i+1;
        }
        System.out.println("La sumatoria es: "+suma);
    }
}
