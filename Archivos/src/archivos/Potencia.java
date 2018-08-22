
package archivos;

import java.util.Scanner;

public class Potencia
{

    public static void main(String[] args)
    {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el valor de N: ");
        int potencia= 1;
        int n=leer.nextInt();
        System.out.println("Ingrese el valor de M: ");
        int m=leer.nextInt();
        for (int i=1;i<=m;i++)
        {
            potencia=potencia * n;
        }
        System.out.println("La potencia es: "+potencia);
    }
    
}
