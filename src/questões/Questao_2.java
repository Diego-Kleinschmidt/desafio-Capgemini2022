package questões;

public class Questao_2 {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 4, 2};
        int diferenca = 2;
        int cont = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) == diferenca) {
                    cont++;
                }
            }
        }
        System.out.println(cont);

    }

}
