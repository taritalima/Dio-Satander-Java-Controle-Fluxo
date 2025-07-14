import java.util.Scanner;

public class IntervaloParImpar {
     public static void main(String[] args) {
        
        int numero2;

        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Informe um numero: ");
        int numero1 = scanner.nextInt();

        while (true) {
            System.out.println("informe o segundo numero: ");
            numero2 = scanner.nextInt();

            if (numero1 < numero2) {
                break;
            }
            System.out.println("Tente novamente o segundo numero tem que ser maior que o primero!");

        }

        System.out.println("Escolha 1 para par ou 2 para impar:");
        char opcao = scanner.next().charAt(0);

        switch (opcao) {
            case '1' -> {
                System.out.println("Números pares em ordem decrescente:");
                for (int i = numero2; i >= numero1; i--) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
             }
            case '2' -> {
                System.out.println("Números impares em ordem decrescente:");
                for (int i = numero2; i >= numero1; i--) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
             }

            default -> System.out.println("Opção invalida");
        }
             scanner.close();

    }
    
}
