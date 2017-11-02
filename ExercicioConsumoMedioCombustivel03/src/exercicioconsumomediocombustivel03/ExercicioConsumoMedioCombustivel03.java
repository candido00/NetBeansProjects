/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioconsumomediocombustivel03;

import java.util.Scanner;

/**
 *
 * @author Candido
 */
public class ExercicioConsumoMedioCombustivel03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
