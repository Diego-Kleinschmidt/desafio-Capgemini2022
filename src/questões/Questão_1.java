package questões;

import java.util.Arrays;
import java.util.Scanner;

public class Questão_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("quantos numeros serão? ");
        int numerosArray = teclado.nextInt();

        numerosArray++;

        int[] array = new int[numerosArray];

        for (int i = 1; i < array.length; i++) {
            System.out.print("Digite " + i + "° numeros: ");
            array[i] = (teclado.nextInt());
        }

        Arrays.sort(array);

        int mediana;
        int metadeDoArray = array.length / 2;
        mediana = array[metadeDoArray];

        System.out.println("A mediana é " + mediana);
    }

}
