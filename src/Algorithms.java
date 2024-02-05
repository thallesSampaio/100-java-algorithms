import java.util.Scanner;

public class Algorithms {

    Scanner scanner = new Scanner(System.in);

    public void Alghoritm01() {
        System.out.println("Olá, mundo!");
    }

    public void Alghoritm02() {
        System.out.print("Olá, qual seu nome? ");
        String nome = scanner.next();
        System.out.println("Bem vindo(a) " + nome + "!");
    }
    public void Alghoritm03() {
        System.out.print("Nome do funcionário: ");
        String nome = scanner.next();
        System.out.print("Salário: ");
        float salario = scanner.nextFloat();
        System.out.println("O funcionário " + nome + " tem um salário de R$" + salario);
    }

    public void Alghoritm04() {
        System.out.print("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite mais um numero: ");
        int n2 = scanner.nextInt();
        System.out.println("A some entre " + n1 + " e " + n2 + " é igual a: " + (n1 + n2));
    }

    public void Alghoritm05() {
        System.out.print("Digite a primeira nota: ");
        float n1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = scanner.nextFloat();
        float r = (n1 + n2) / 2;
        System.out.println("A média entre " + n1 + " e " + n2 + " é igual a: " + r);
    }

    public void Alghoritm06() {
        System.out.print("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.println("O antecessor de: " + n1 + " é " + (-1 + n1));
        System.out.println("O sucessor de: " + n1 + " é " + (n1+1));
    }

    public void Alghoritm07() {
        System.out.print("Digite um numero: ");
        float n = scanner.nextFloat();
        System.out.print("O dobro de: " + n + " é: " + (n * 2));
        System.out.println("A terça parte de " + n + " é:" + (n / 3));
    }

    public void Alghoritm08() {
        System.out.print("Digite uma distancia: ");
        float n = scanner.nextFloat();
        System.out.println("A distancia: " + n + " metros corresponde a:");
        System.out.println((n / 1000) +"Km");
        System.out.println((n / 100) + "Hm");
        System.out.println((n / 10) + "Dam");
        System.out.println((n / 0.1) + "Dm");
        System.out.println((n / 0.01) + "Cm");
        System.out.println((n / 0.001) + "Mm");
    }

    public void Alghoritm09() {
        System.out.print("Digite quanto dinheiro você tem: ");
        float n = scanner.nextFloat();
        double r = (n / 4.97);
        System.out.println("Você tem R$" + n + " e pode comprar U$" + r);
    }

    public void Alghoritm10() {
        System.out.print("Digite a largura da parede: ");
        double b = scanner.nextDouble();
        System.out.print("Digite a altura da parede: ");
        double h = scanner.nextDouble();
        double r = (b * h) / 2 ;
        System.out.println("A área a ser pintada é: " + (b*h) + "m² e será necessário um total de " + r + " litros de tinta");
    }

    public void Alghoritm11() {
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();
        double r  = Math.pow(b,2) - (4 * (a * c));
        System.out.println("Valor de delta Δ é: "+r);
    }

    public void Alghoritm12() {
        System.out.print("Digite o valor do produto: ");
        double p = scanner.nextDouble();
        System.out.println("O preço promocional com 5% de desconto é: " + (p - (p * 0.05)));
    }

    public void Alghoritm13() {
        System.out.print("Digite seu salário: ");
        double i = scanner.nextDouble();
        System.out.println("Seu novo salário com 15% de aumento é: " + (i + (i * 0.15)));
    }

    public void Alghoritm14() {
        System.out.print("Digite a quantidade de quilômetros percorridos: ");
        double km = scanner.nextDouble();
        System.out.print("Digite quantos dias o carro ficou alugado: ");
        int dias = scanner.nextInt();
        System.out.println("Total a pagar: " + ((km * 0.2)+(dias*90)) + "R$");
    }

    public void Alghoritm15() {
        System.out.print("Digite número de dias trabalhados no mês: ");
        int dias = scanner.nextInt();
        int h = dias * 8;
        System.out.println("Salário: " + (h * 25));
    }

    public void Alghoritm16() {
    }

    public void Alghoritm17() {
    }

    public void Alghoritm18() {
    }

    public void Alghoritm19() {
    }

    public void Alghoritm20() {
    }

    public void Alghoritm21() {
    }

    public void Alghoritm22() {
    }

    public void Alghoritm23() {
    }

    public void Alghoritm24() {
    }

    public void Alghoritm25() {
    }

    public void Alghoritm26() {
    }

    public void Alghoritm27() {
    }

    public void Alghoritm28() {
    }

    public void Alghoritm29() {
    }

    public void Alghoritm30() {
    }

    public void Alghoritm31() {
    }

    public void Alghoritm32() {
    }

    public void Alghoritm33() {
    }

    public void Alghoritm34() {
    }

    public void Alghoritm35() {
    }

    public void Alghoritm36() {
    }

    public void Alghoritm37() {
    }

    public void Alghoritm38() {
    }

    public void Alghoritm39() {
    }

    public void Alghoritm40() {
    }

    public void Alghoritm41() {
    }

    public void Alghoritm42() {
    }

    public void Alghoritm43() {
    }

    public void Alghoritm44() {
    }

    public void Alghoritm45() {
    }

    public void Alghoritm46() {
    }

    public void Alghoritm47() {
    }

    public void Alghoritm48() {
    }

    public void Alghoritm49() {
    }

    public void Alghoritm50() {
    }

    public void Alghoritm51() {
    }

    public void Alghoritm52() {
    }

    public void Alghoritm53() {
    }

    public void Alghoritm54() {
    }

    public void Alghoritm55() {
    }

    public void Alghoritm56() {
    }

    public void Alghoritm57() {
    }

    public void Alghoritm58() {
    }

    public void Alghoritm59() {
    }

    public void Alghoritm60() {
    }

    public void Alghoritm61() {
    }

    public void Alghoritm62() {
    }

    public void Alghoritm63() {
    }

    public void Alghoritm64() {
    }

    public void Alghoritm65() {
    }

    public void Alghoritm66() {
    }

    public void Alghoritm67() {
    }

    public void Alghoritm68() {
    }

    public void Alghoritm69() {
    }

    public void Alghoritm70() {
    }

    public void Alghoritm71() {
    }

    public void Alghoritm72() {
    }

    public void Alghoritm73() {
    }

    public void Alghoritm74() {
    }

    public void Alghoritm75() {
    }

    public void Alghoritm76() {
    }

    public void Alghoritm77() {
    }

    public void Alghoritm78() {
    }

    public void Alghoritm79() {
    }

    public void Alghoritm80() {
    }

    public void Alghoritm81() {
    }

    public void Alghoritm82() {
    }

    public void Alghoritm83() {
    }

    public void Alghoritm84() {
    }

    public void Alghoritm85() {
    }

    public void Alghoritm86() {
    }

    public void Alghoritm87() {
    }

    public void Alghoritm88() {
    }

    public void Alghoritm89() {
    }

    public void Alghoritm90() {
    }

    public void Alghoritm91() {
    }

    public void Alghoritm92() {
    }

    public void Alghoritm93() {
    }

    public void Alghoritm94() {
    }

    public void Alghoritm95() {
    }

    public void Alghoritm96() {
    }

    public void Alghoritm97() {
    }

    public void Alghoritm98() {
    }

    public void Alghoritm99() {
    }

    public void Alghoritm100() {
    }


}
