import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
        System.out.println("instruçoes em breve;;;;");
            System.out.print("Escolha uma opcao: ");
            int option = scanner.nextInt();
            Controller controller = new Controller();
            controller.Algorithm(option);
        }
    }
}