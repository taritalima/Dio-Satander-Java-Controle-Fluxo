
import java.util.Scanner;

public class DivisaoRestoZero {

    public static void main(String[] args) {

        int numeroVerify;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numeroInicial = scanner.nextInt();

        while (true) {
            System.out.println("informe o segundo numero: ");
            numeroVerify = scanner.nextInt();

            if (numeroVerify < numeroInicial) {
                System.out.printf("Tente novamente o segundo numero tem que ser maior que o primero! \n");
                continue;
            }

            int result = numeroVerify % numeroInicial;
            System.out.printf("%s %% %s = %s \n", numeroVerify, numeroInicial, result);

            if (result != 0) {
                System.out.println("Resto diferente de zero. Encerrando o programa.");
                break;
            }
        }

        scanner.close();

    }

}
