import java.util.Scanner;

public class CalculadoraIMC {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Informe o seu peso: ");
        float peso = scanner.nextFloat();

        float IMC = peso / (altura * altura);

        System.out.printf("valor do imc! %.2f \n", IMC);
        if (IMC <= 18.5) {
            System.out.println("Abaixo do peso");
        }

        else if(IMC >= 18.6 && IMC <= 24.9){
            System.out.println("Peso ideal");
        }

        else if(IMC >= 25.0 && IMC <= 29.9){
            System.out.println("Levemente acima do peso");
        }

        else if(IMC >= 30.0 && IMC <= 34.9){
            System.out.println("Obesidade grau I");
        }

        else if(IMC >= 35.0 && IMC <= 39.9){
            System.out.println("Obesidade grau II(Severa)");
        }
        else{
            System.out.println("Obesidade grau III(Mórbida)");
        }
        scanner.close();

    }
}
