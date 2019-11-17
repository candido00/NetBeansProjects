
package exercicioconsumomediocombustivel03;

import java.util.Scanner;

public class ExercicioConsumoMedioCombustivel03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double consumo;
        double kmInicial;
        double kmFinal;
        double combust;
        double kmTotal;
        System.out.println("informe a quilometragem inicial:");
        kmInicial = entrada.nextDouble();
        System.out.println("informe a quilometragem final:");
        kmFinal = entrada.nextDouble();
        System.out.println("informe a quantidade em litros de combustivel:");
        combust = entrada.nextDouble();
        kmTotal = kmFinal-kmInicial;
        consumo = combust/kmTotal;
        System.out.println(consumo);
        System.out.println("o total percorrido foi:"+kmTotal+" KM");
        System.out.println("a taxa de consumo medio é de:"+consumo+" litros por KM percorrido");
    }
    
}
