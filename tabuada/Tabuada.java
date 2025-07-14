import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Informe um numero para fazer a tabuada dele: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= 10; i++){
            int tabuada;
            tabuada = numero  * i;
            System.out.printf("%d * %d: %d \n", i, numero,tabuada);
            }
        }
}
