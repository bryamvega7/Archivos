
package archivos;

import java.util.Scanner;

public class Circulo 
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner (System.in);
        double radio,area,longitud;
        final double pi=3.1416;
        System.out.println("Ingrese radio:");
        radio=leer.nextFloat();
        area=pi*radio*radio;
        longitud=2*pi*radio;
        System.out.println("El area es:"+area+"La longitud es:"+longitud);
    }
}
