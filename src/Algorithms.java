import java.util.Scanner;

import static java.lang.Integer.parseInt;

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
        System.out.println("Salário: " + (h * 25) + "R$");
    }

    public void Alghoritm16() {
        System.out.print("Quantidade de cigarros fumados por dia: ");
        int c = scanner.nextInt();
        System.out.print("Durante quantos anos já fumou: ");
        int a = scanner.nextInt();
        System.out.println("Total de dias de vida perdidos: " + ( (((a*365) * (c * 10)) / 60) / 24) );
    }

    public void Alghoritm17() {
        System.out.println("Digite a velocidade do carro: ");
        int v = scanner.nextInt();
        if (v > 80) {
            System.out.println("Velocidade atual (" +v+ "Km/h) acima da permitida multa aplicada de: R$" + ((v -80) * 5));
        } else {
            System.out.println("Velocidade atual: " + v + "Km/h. Dentro da velocidade permitida.");
        }
    }

    public void Alghoritm18() {
        System.out.print("Digite o ano do seu nascimento: ");
        int a = scanner.nextInt();
        int r = (2024 - a);
        if (r >= 18) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
    }

    public void Alghoritm19() {
        System.out.print("Digite o nome do aluno: ");
        String name = scanner.next();
        System.out.print("Digite primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite segunda nota: ");
        double n2 = scanner.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("Média: " + media);
        if (media > 7) {
            System.out.println("O aluno " + name + " teve um bom aproveitamento");
        } else {
            System.out.println("O aluno " + name + " teve um mau aproveitamento");
        }
    }

    public void Alghoritm20() {
        System.out.print("Digite um numero ");
        int number = scanner.nextInt();
        if ((number%2) == 0) {
            System.out.println((number + " é par!"));
        } else {
            System.out.println((number + " é impar!"));
        }
    }

    public void Alghoritm21() {
        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();
        if((ano % 4) == 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }

    public void Alghoritm22() {
        System.out.println("Digite o ano do seu nascimento: ");
        int ano = scanner.nextInt();
        if ((2024 - ano) > 18) {
            System.out.println("Já passaram " + ((2024 - ano) - 18) + " anos.");
        } else if ((2024 - ano) < 18){
            System.out.println("Faltam " + (18 - (2024 - ano)) + " anos.");
        }
    }

    public void Alghoritm23() {
        System.out.print("Digite o nome: ");
        String nome = scanner.next();
        System.out.print("Digite seu sexo ( [1] para homem - [2] para mulher): ");
        int sexo = scanner.nextInt();
        System.out.print("Digite o valor total das compras: ");
        double valor = scanner.nextDouble();
        if (sexo == 2 ) {
            System.out.println("Nome: " + nome + "\nSexo: Feminino" +
                    "\nValor total em compras: " + valor +
                    "\nValor com desconto de 13%: " + (valor - (valor * 0.13)));
        } else {
            System.out.println("Nome: " + nome + "\nSexo: Masculino" +
                    "\nValor total em compras: " + valor +
                    "\nValor com desconto de 13%: " + (valor - (valor * 0.05)));
        }
    }

    public void Alghoritm24() {
        System.out.print("Digite quantos quilômetros deseja percorrer: ");
        double km = scanner.nextDouble();
        if (km <= 200) {
            System.out.println("Preço da passagem: R$" + (km * 0.50));
        } else {
            System.out.println("Preço da passagem: R$" + (km * 0.45));
        }
    }

    public void Alghoritm25() {
        System.out.print("Digite o tamanho da primeira reta: ");
        double r1 = scanner.nextDouble();
        System.out.print("Digite o tamanho da segunda reta: ");
        double r2 = scanner.nextDouble();
        System.out.print("Digite o tamanho da terceira reta: ");
        double r3 = scanner.nextDouble();
        if (r3 > (r1 + r2)) {
            System.out.println("Não é possível formar um triângulo com os valores informados.");
        } else if (r2 > (r1 + r3)) {
            System.out.println("Não é possível formar um triângulo com os valores informados.");
        } else if (r1 > (r2 + r3)) {
            System.out.println("Não é possível formar um triângulo com os valores informados.");
        } else {
            System.out.println("É possiel formar um triangulo com os valores informados.");
        }
    }

    public void Alghoritm26() {
        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("O primeiro valor é o maior.");
        } else if(n1 < n2) {
            System.out.println("O segundo valor é o maior.");
        } else {
            System.out.println("Os valores são iguais.");
        }
    }

    public void Alghoritm27() {
        System.out.print("Digite primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite segunda nota: ");
        double n2 = scanner.nextDouble();
        double media = (n1 + n2) / 2;
        if (media <= 4.9) {
            System.out.println("Reprovado.");
        } else if (media <= 6.9) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Aprovado.");
        }
    }

    public void Alghoritm28() {
        System.out.print("Digite a largura: ");
        double l = scanner.nextDouble();
        System.out.print("Digite o comprimento: ");
        double w = scanner.nextDouble();
        double area = l * w;
        if (area < 100) {
            System.out.println("Area: " + area + "m². TERRENO POPULAR.");
        } else if (area >= 100 && area <= 500) {
            System.out.println("Area: " + area + "m². TERRENO MASTER.");
        } else {
            System.out.println("Area: " + area + "m². TERRENO VIP.");
        }
    }

    public void Alghoritm29() {
        System.out.print("Nome do funcionário: ");
        String nome = scanner.next();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Quantos anos trabalha na empresa: ");
        double anos = scanner.nextDouble();
        if (anos <= 3) {
            System.out.println("Nome: " + nome +
                    "\nSalário atual: R$" + salario +
                    "\nSalário reajustado: R$" + (salario + (salario * 0.03)) +
                    "\nAnos de empresa: " + anos);
        } else if (anos > 3 && anos < 10) {
            System.out.println("Nome: " + nome +
                    "\nSalário atual: R$" + salario +
                    "\nSalário reajustado: R$" + (salario + (salario * 0.125)) +
                    "\nAnos de empresa: " + anos);
        } else {
            System.out.println("Nome: " + nome +
                    "\nSalário atual: R$" + salario +
                    "\nSalário reajustado: R$" + (salario + (salario * 0.2)) +
                    "\nAnos de empresa: " + anos);
        }
    }

    public void Alghoritm30() {
        System.out.print("Digite o tamanho da primeira reta: ");
        double r1 = scanner.nextDouble();
        System.out.print("Digite o tamanho da segunda reta: ");
        double r2 = scanner.nextDouble();
        System.out.print("Digite o tamanho da terceira reta: ");
        double r3 = scanner.nextDouble();
        if (r3 > (r1 + r2)) {
            System.out.println("Não é possível formar um triângulo com os valores informados.");
        } else if (r2 > (r1 + r3)) {
            System.out.println("Não é possível formar um triângulo com os valores informados.");
        } else if (r1 > (r2 + r3)) {
            System.out.println("Não é possível formar um triângulo com os valores informados.");
        } else {
            System.out.print("É possiel formar um triangulo com os valores informados.");
            if (r1 == r2 && r2 == r3) {
                System.out.println(" Sendo esse: EQUILÁTERO.");
            } else if (r1 == r2 || r2 == r3 || r1 == r3) {
                System.out.println(" Sendo esse: ISÓSCELES.");
            } else {
                System.out.println(" Sendo esse: ESCALENO.");
            }
        }
    }

    public void Alghoritm31() {
        System.out.print("Jogador 1 escolha: [1] PEDRA - [2] PAPEL - [3] TESOURA -");
        int option = scanner.nextInt();
        System.out.print("Computador 2 escolha: [1] PEDRA - [2] PAPEL - [3] TESOURA -");
        int option2 = scanner.nextInt();
        switch (option) {
            case 1:
                if(option2 == 2) {
                    System.out.println("Jogador 2 venceu!");
                } else if(option2 == 3) {
                    System.out.println("Jogador 1 venceu!");
                } else {
                    System.out.println("Empate!");
                }
                break;
            case 2:
                if(option2 == 1) {
                    System.out.println("Jogador 1 venceu!");
                } else if(option2 == 3) {
                    System.out.println("Jogador 2 venceu!");
                } else {
                    System.out.println("Empate!");
                }
                break;
            case 3:
                if(option2 == 1) {
                    System.out.println("Jogador 2 venceu!");
                } else if(option2 == 2) {
                    System.out.println("Jogador 1 venceu!");
                } else {
                    System.out.println("Empate!");
                }
                break;
        }
    }

    public void Alghoritm32() {
        double rand = (Math.floor(Math.random() * 5 + 1)) ;
        System.out.print("O computador sorteou um numero de 1 a 5, digite seu palpite: ");
        double palpite = scanner.nextDouble();
        if(rand == palpite) {
            System.out.println("Você acertou! ");
        } else {
            System.out.println("Você errou! Escolha da maquina: " + rand);
        }
    }

    public void Alghoritm33() {
        System.out.print("Digite o valor da casa: ");
        double casa = scanner.nextDouble();
        System.out.print("Digite seu salario: ");
        double salario = scanner.nextDouble();
        System.out.print("Quantos anos vai pagar:  ");
        int anos = scanner.nextInt();
        double mensal = (casa / (anos * 12));
        double excedente = salario + (salario * 0.3);
        if (mensal > excedente) {
            System.out.println("Empréstimo negado! ");
        } else {
            System.out.println("Empréstimo aprovado! ");
        }
    }

    public void Alghoritm34() {
        System.out.print("Digite seu peso:  ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura:  ");
        double altura = Math.pow(scanner.nextDouble(), 2);
        double imc = peso / altura;
        if(imc < 18.5) {
            System.out.println("Abaixo do peso! IMC: " + imc);
        } else if (imc <= 25) {
            System.out.println("Peso ideal! IMC: " + imc);
        } else if (imc <= 30) {
            System.out.println("Sobrepeso! IMC: " + imc);
        } else if (imc <= 40 ) {
            System.out.println("Obesidade! IMC: " + imc);
        } else {
            System.out.println("Obesidade mórbida! IMC: " + imc);
        }
    }

    public void Alghoritm35() {
        System.out.print("Tipo do carro: [1] POPULAR - [2] LUXUOSO ");
        int carro = scanner.nextInt();
        System.out.print("Dias de aluguel:  ");
        int dias = scanner.nextInt();
        System.out.print("Quilômetros percorridos:  ");
        double km = scanner.nextDouble();
        switch (carro) {
            case 1:
                if(km <= 100) {
                    km = km * 0.20;
                } else if (km > 100) {
                    km = km * 0.10;
                }
                System.out.println("Total a ser pago: R$" + (km + (dias * 90)));
                break;

            case 2:
                if(km <= 100) {
                    km = km * 0.30;
                } else if (km > 100) {
                    km = km * 0.25;
                }
                System.out.println("Total a ser pago: R$" + (km + (dias * 150)));
                break;
        }
    }

    public void Alghoritm36() {
        System.out.print("Quantidade de horas:  ");
        int horas = scanner.nextInt();
        if (horas < 10) {
            System.out.println("Total de pontos: " + (horas * 2) +
                    "\nTotal de dinheiro ganho: R$" + ((horas * 2) * 0.05) );
        } else if (horas <= 20) {
            System.out.println("Total de pontos: " + (horas * 5) +
                    "\nTotal de dinheiro ganho: R$" + ((horas * 5) * 0.05) );
        } else if (horas > 20) {
            System.out.println("Total de pontos: " + (horas * 10) +
                    "\nTotal de dinheiro ganho: R$" + ((horas * 10) * 0.05) );
        }
    }

    public void Alghoritm37() {
        System.out.print("Digite o salario: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite seu sexo ( [1] para homem - [2] para mulher): ");
        int sexo = scanner.nextInt();
        System.out.print("Digite a quantos anos esse funcionário esta na empresa: ");
        double anos = scanner.nextDouble();
        switch(sexo) {
            case 1:
                if (anos < 20) {
                    System.out.println("Novo salário: R$" + (salario + (salario * 0.03)));
                } else if (anos >= 20 && anos < 30) {
                    System.out.println("Novo salário: R$" + (salario + (salario * 0.13)));
                } else if(anos > 30) {
                    System.out.println("Novo salário: R$" + (salario + (salario * 0.25)));
                }
                break;

            case 2:
                if (anos < 15) {
                    System.out.println("Novo salário: R$" + (salario + (salario * 0.05)));
                } else if (anos >= 15 && anos < 20) {
                    System.out.println("Novo salário: R$" + (salario + (salario * 0.12)));
                } else if(anos > 20) {
                    System.out.println("Novo salário: R$" + (salario + (salario * 0.23)));
                }
                break;
        }
    }

    public void Alghoritm38() {
        int i = 6;
        while (i < 12) {
            System.out.println(i);
            i++;
        }
        System.out.println("Acabou!");
    }

    public void Alghoritm39() {
        int i = 10;
        while (i > 2) {
            System.out.println(i);
            i--;
        }
        System.out.println("Acabou!");
    }

    public void Alghoritm40() {
        int i = 0;
        while (i < 21) {
            System.out.println(i);
            i = i + 3;
        }
        System.out.println("Acabou!");
    }

    public void Alghoritm41() {
        int i = 100;
        while (i != -5) {
            System.out.println(i);
            i = i -5;
        }
        System.out.println("Acabou!");
    }

    public void Alghoritm42() {
        System.out.print("Digite um numero inteiro e positivo: ");
        int numero = scanner.nextInt();
        int i = 1;
        while (i != numero) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);
        i++;
        System.out.println("Acabou!");
    }

    public void Alghoritm43() {
        int i = 30;
        while (i > 0) {
            if (i % 4 == 0) {
                System.out.println("[" + i + "]" );
                i--;
            } else {
                System.out.println(i);
                i--;
            }
        }
    }

    public void Alghoritm44() {
        System.out.print("Digite o valor inicial da contagem: ");
        int inicial = scanner.nextInt();
        System.out.print("Digite o valor final da contagem: ");
        int finall = scanner.nextInt();
        System.out.print("Digite o valor de incremento da contagem: ");
        int incremento = scanner.nextInt();
        while (inicial < finall) {
            System.out.println(inicial);
            inicial = inicial + incremento;
        }
        System.out.println("Acabou!");
    }

    public void Alghoritm45() {
        System.out.print("Digite o valor inicial da contagem: ");
        int inicial = scanner.nextInt();
        System.out.print("Digite o valor final da contagem: ");
        int finall = scanner.nextInt();
        System.out.print("Digite o valor de incremento da contagem: ");
        int incremento = scanner.nextInt();
        if (inicial < finall) {
            while (inicial < finall) {
                System.out.println(inicial);
                inicial = inicial + incremento;
            }
            System.out.println("Acabou!");
        } else if (inicial > finall) {
            while (inicial > finall) {
                System.out.println(inicial);
                inicial = inicial - incremento;
            }
            System.out.println("Acabou!");
        }
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
