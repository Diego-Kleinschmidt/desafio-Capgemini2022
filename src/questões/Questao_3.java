package questões;

import java.util.Scanner;

public class Questao_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String frase = teclado.nextLine();
        frase = frase.replace(" ", "");

        int tamanho = frase.length();

        int raiz = (int) Math.round(Math.sqrt(tamanho));

        char[][] array = new char[raiz][raiz];

        int indice = 0;

        for (int linha = 0; linha < array.length; linha++) {
            for (int coluna = 0; coluna < array.length; coluna++) {
                if (indice < frase.length()) {
                    array[linha][coluna] = frase.charAt(indice);
                    indice++;
                }
            }
        }

        for (int coluna = 0; coluna < array.length; coluna++) {
            for (int linha = 0; linha < array.length; linha++) {
                System.out.print(array[linha][coluna]);
            }
            System.out.print(" ");
        }

    }

}
