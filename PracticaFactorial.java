/* Hacer un programa que lea un numero entero positivo y luego imprima su factorial
Ejemplo   5!     5*4*3*2*1    o     1*2*3*4*5 */
package practicafactorial;
import java.util.Scanner;

public class PracticaFactorial {

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        double fact=1;
        int n;
        System.out.print("Digite numero entero positivo ");
        n=objread.nextInt();
        for (int i = 2; i <=n; i++) {
            fact*=i;
        }
        System.out.println("\n El factorial de " + n + " es " + fact);
    }
    
}
