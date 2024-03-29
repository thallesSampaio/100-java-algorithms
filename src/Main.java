import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a solução dos 100 algoritmos do Gustavo Guanabara em Java!");
        System.out.println("Você pode digitar um número de 1 a 100 para testar o algoritmo proposto na lista do Guanabara.");
        while(true) {
            System.out.print("Escolha 0 para finalizar o programa ou um número de 1 a 100 opcão: ");
            int option = scanner.nextInt();
            Controller controller = new Controller();
            controller.Algorithm(option);
        }
    }
}