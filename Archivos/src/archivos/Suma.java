
package archivos;

import java.util.Scanner;

public class Suma 
{

    public static void main(String[] args)
    {
        Scanner leer=new Scanner (System.in);
        int n1,n2,n3;
        System.out.println("Ingrese primer numero: ");
        n1=leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        n2=leer.nextInt();
        System.out.println("Ingrese tercer numero: ");
        n3=leer.nextInt();
        System.out.println("La suma es: "+(n1+n2+n3));
    }
    
}
