import java.util.Arrays;
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
        int i = 6;
        int j = 0;
        while (i < 102) {
            System.out.println(i);
            i = i + 2;
            j = j + i;
        }
        System.out.println("o resultado da soma é: " + j) ;
    }

    public void Alghoritm47() {
        int i = 500;
        int j = 0;
        while (i > -50) {
            System.out.println(i);
            i = i - 50;
            j = j + i;
        }
        System.out.println("o resultado da soma é: " + j) ;
    }

    public void Alghoritm48() {
        int i = 0;
        int total = 0;
        while (i < 7) {
            i++;
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            total = total + numero;
        }
        System.out.println("Soma total: " + total);
    }

    public void Alghoritm49() {
        int i = 0;
        int pares = 0;
        while (i < 6) {
            i++;
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            if ((numero % 2) == 0) {
               pares++;
            }
        }
        System.out.println("Total de pares: " + pares +
                "\nTotal de impares: " + (i - pares));
    }

    public void Alghoritm50() {
        int i = 0;
        System.out.println("Numeros sorteados: ");
        int maioresCinco = 0;
        int divisiveisTres = 0;
        while (i < 20) {
            i++;
            double rand = (Math.floor(Math.random() * 10 + 1));
            System.out.println(rand);
            if (rand > 5) {
                maioresCinco++;
            }
            if (rand %3 == 0) {
                divisiveisTres++;
            }
        }
        System.out.println("Total de numeros maiores que cinco: " + maioresCinco);
        System.out.println("Total de numeros divisiveis por tres: " + divisiveisTres);
    }

    public void Alghoritm51() {
        int i = 0;
        double menorValor = 0;
        double maiorValor = 0;
        while (i < 8) {
            i++;
            System.out.print("Digite o preço do produto: ");
            double valorProduto = scanner.nextInt();
            if (valorProduto > maiorValor)  {
                maiorValor = valorProduto;
            }
            if (menorValor == 0)  {
                menorValor = valorProduto;
            } else if (menorValor > valorProduto) {
                menorValor = valorProduto;
            }
        }
        System.out.println("Maior valor digitado: " + maiorValor +
                "\nMenor valor digitado: " + menorValor);
    }

    public void Alghoritm52() {
        int i = 0;
        int media = 0;
        int maiorDezoito = 0;
        int menorCinco = 0;
        int maiorIdade = 0;
        while (i < 10 ) {
            i++;
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            media = media + idade;
            if(idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < 5) {
                menorCinco++;
            } else if (idade > 18) {
                maiorDezoito++;
            }
        }
        System.out.println("Maior idade lida: " + maiorIdade +
                "\nMedia de idade: " + (media / 10) +
                "\nTotal de maiores que 18 anos: " + maiorDezoito +
                "\nTotal de menores que cinco: " +menorCinco);
    }

    public void Alghoritm53() {
        int i = 0;
        int homens = 0;
        int mulheres = 0;
        int mediaGrupo = 0;
        int mediaHomens = 0;
        int maioresVinte = 0;
        while (i < 5) {
            i++;
            System.out.print("Digite seu sexo ( [1] para homem - [2] para mulher): ");
            int sexo = scanner.nextInt();
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            mediaGrupo = mediaGrupo + idade;
            switch (sexo) {
                case 1:
                    homens++;
                    mediaHomens = mediaHomens + idade;
                    break;
                case 2:
                    mulheres++;
                    if (idade > 20) {
                        maioresVinte++;
                    }
                    break;
            }
        }
        System.out.println("Média de idade do grupo: " + (mediaGrupo / 5) +
                "\nMédia de idade homens: " + (mediaHomens / homens) +
                "\nTotal de homens: " + homens +
                "\nTotal de mulheres: " + mulheres +
                "\nTotal de mulheres com mais de 20 anos: " + maioresVinte);
    }

    public void Alghoritm54() {
        int i = 0;
        double mediaAltura = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        while (i < 7) {
            i++;
            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();
            mediaAltura = mediaAltura + altura;
            System.out.print("Digite seu peso: ");
            double peso = scanner.nextDouble();
            if (peso < 50) {
                if( altura < 1.60) {
                    c++;
                }
            } else if (peso > 90) {
                b++;
                if (peso > 100) {
                    if(altura > 1.90) {
                        d++;
                    }
                }
            }
        }
        System.out.println("Média de altura do grupo: " + (mediaAltura / 7) +
                "\nTotal de pessoas que pesam mais de 90Kg: " + b +
                "\nTotal de pessoas que pesam mais que 50Kg e tem menos de 1.60m: " + c +
                "\nTotal de pessoas que pesam mais de 100Kg e tem mais de 1.90m: " + d);
    }

    public void Alghoritm55() {
        int i = 0;
        double rand = (Math.floor(Math.random() * 10 + 1)) ;
        boolean resultado = false;
        System.out.println("O computador sorteou um numero de 1 a 10 e você terá 4 tentativas para acertar.");
        while(i < 4) {
            i++;
            System.out.print("Digite seu palpite: ");
            double palpite = scanner.nextDouble();
            if(rand == palpite) {
                System.out.println("Você acertou! ");
                resultado = true;
                i = 4;
            } else {
                System.out.println("Você errou! Tente novamente.");
            }
        }
        if (!resultado) {
            System.out.println("Você perdeu! Numero sorteado: " + rand);
        }
    }

    public void Alghoritm56() {
        int number = 0;
        while (number != 1111) {
            System.out.print("Digite um numero: ");
            number = scanner.nextInt();
        }
    }

    public void Alghoritm57() {
        int option = 0;
        double totalSalarioHomens = 0;
        double totalSalarioMulheres = 0;
        while (option != 2) {
            System.out.print("Digite seu sexo ( [1] para homem - [2] para mulher): ");
            int sexo = scanner.nextInt();
            switch (sexo) {
                case 1:
                    System.out.print("Digite seu salário: ");
                    double salarioHomens = scanner.nextDouble();
                    totalSalarioHomens = totalSalarioHomens + salarioHomens;
                    break;
                case 2:
                    System.out.print("Digite seu salário: ");
                    double salarioMulheres = scanner.nextDouble();
                    totalSalarioMulheres = totalSalarioMulheres + salarioMulheres;
                    break;
            }
            System.out.print("Deseja continuar? [1] para sim / [2] para não: ");
            option = scanner.nextInt();
        }
        System.out.println("Total de salário pago aos homens: R$" + totalSalarioHomens +
                "\nTotal de salário pago as mulheres: R$" + totalSalarioMulheres);
    }

    public void Alghoritm58() {
        int idade = 0;
        int totalAlunos = 0;
        int mediaIdade = 0;
        while (idade != 999) {
            System.out.print("Digite a idade do aluno: ");
            idade = scanner.nextInt();
            if (idade != 999) {
                totalAlunos++;
                mediaIdade = mediaIdade + idade;
            }
        }
        System.out.println("Total de alunos: " + totalAlunos +
                "\nMédia de idade: " + (mediaIdade / totalAlunos));
    }

    public void Alghoritm59() {
        int option = 0;
        int totalHomens = 0;
        int mediaHomens = 0;
        int maiorIdade = 0;
        int menorIdade =  0;
        while (option != 2) {
            System.out.print("Digite seu sexo ([1] para homem - [2] para mulher): ");
            int sexo = scanner.nextInt();
            switch (sexo) {
                case 1:
                    totalHomens++;
                    System.out.print("Digite sua idade: ");
                    int idadeHomens = scanner.nextInt();
                    mediaHomens = mediaHomens + idadeHomens;
                    if(idadeHomens > maiorIdade) {
                        maiorIdade = idadeHomens;
                    }
                    break;
                case 2:
                    System.out.print("Digite sua idade: ");
                    int idadeMulheres = scanner.nextInt();
                    if (menorIdade == 0) {
                        menorIdade = idadeMulheres;
                    } else if(idadeMulheres < menorIdade) {
                        menorIdade = idadeMulheres;
                    }
                    if(idadeMulheres > maiorIdade) {
                        maiorIdade = idadeMulheres;
                    }
                    break;
            }
            System.out.print("Deseja continuar? [1] para sim / [2] para não: ");
            option = scanner.nextInt();
        }
        System.out.println("Total de homens cadastrados: " + totalHomens +
                "\nMaior idade lida: " + maiorIdade +
                "\nIdade da mulher mais jovem: " +menorIdade +
                "\nMédia de idade entre os homens: " + (mediaHomens / totalHomens));
    }

    public void Alghoritm60() {
        int option = 0;
        int maiorIdade = 0;
        String maisVelha = "null";
        int menorIdade = 0;
        int maisTrinta = 0;
        int menosDezoito = 0;
        int totalPessoas = 0;
        int media = 0;
        String maisJovem = "null";
        while (option != 2) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            media = media + idade;
            if (idade > maiorIdade) {
                maiorIdade = idade;
                maisVelha = nome;
            }
            System.out.print("Digite seu sexo ([1] para homem - [2] para mulher): ");
            int sexo = scanner.nextInt();
            switch (sexo) {
                case 1:
                    if(idade > 30) {
                        maiorIdade = idade;
                    }
                    totalPessoas++;
                    break;
                case 2:
                    if (menorIdade == 0) {
                        menorIdade = idade;
                    } else if(idade < menorIdade) {
                        menorIdade = idade;
                        maisJovem = nome;
                    }
                    if (idade < 18) {
                        menosDezoito++;
                    }
                    totalPessoas++;
                    break;
            }
            System.out.print("Deseja continuar? [1] para sim / [2] para não: ");
            option = scanner.nextInt();
        }
        System.out.println("Média de idade: " + (media / totalPessoas) +
                "\nNome da pessoa mais velha: " + maisVelha +
                "\nNome da pessoa mais jovem: " + maisJovem +
                "\nTotal de homens com mais de 30 anos: " + maisTrinta +
                "\n Total de mulheres com menos de 18 anos: " +menosDezoito);
    }

    public void Alghoritm61() {
        int i = 0;
        do {
            System.out.println(i);
            i = i + 3;

        } while(i < 33);
        System.out.println("Acabou!");
    }

    public void Alghoritm62() {
        int option = 0;
        int contadorIdades = 0;
        int totalIdades = 0;
        int maiorVinteUm = 0;
        do {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            contadorIdades++;
            totalIdades = totalIdades + idade;
            if (idade > 21) {
                maiorVinteUm++;
            }
            System.out.print("Deseja continuar? [1] para sim / [2] para não: ");
            option = scanner.nextInt();
        } while (option != 2);
        System.out.println("Total de idades digitadas: " + contadorIdades +
                "\nTotal de idades acima de 21: " + maiorVinteUm +
                "\nMedia das idades: " + (totalIdades / contadorIdades));
    }

    public void Alghoritm63() {
        int option = 0;
        int somaTotal = 0;
        int menorValor = 0;
        int contador = 0;
        int pares = 0;
        do {
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            somaTotal = somaTotal + numero;
            contador++;
            if (menorValor == 0) {
                menorValor = numero;
            } else if(numero < menorValor){
                menorValor = numero;
            }
            if (numero % 2 == 0) {
                pares++;
            }
            System.out.print("Deseja continuar? [1] para sim / [2] para não: ");
            option = scanner.nextInt();
        } while (option != 2);
        System.out.println("Somatorio total: " + somaTotal +
                "\nMenor valor digitado: " + menorValor +
                "\nMedia entre todos os valores: " + (somaTotal / contador) +
                "\nTotal de numeros pares: " + pares);
    }

    public void Alghoritm64() {
        for (int i = 0; i < 45; i = i + 5) {
            System.out.println(i);
        }
        System.out.println("Acabou!");
    }

    public void Alghoritm65() {
        for (int i = 100; i > -10; i = i - 10) {
            System.out.println(i);
        }
        System.out.println("Acabou!");
    }

    public void Alghoritm66() {
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + (i) + " = " + (numero * i));
        }
    }

    public void Alghoritm67() {
        System.out.println("Digite um numero inteiro e positivo: ");
        int numero = scanner.nextInt();
        for (int i = 0; i < (numero + 1); i++) {
            System.out.println(i);
        }
        System.out.println("Fim!");
    }

    public void Alghoritm68() {
        int totalMulheres = 0;
        int totalHomens = 0;
        int mediaMulheres = 0;
        int maiorPesoHomens = 0;
        for (int i = 0; i < 9; i++) {
            System.out.print("Digite seu sexo ( [1] para homem - [2] para mulher): ");
            int sexo = scanner.nextInt();
            System.out.print("Digite seu peso: ");
            int peso = scanner.nextInt();
            switch(sexo) {
                case 1:
                    if (maiorPesoHomens == 0) {
                        maiorPesoHomens = peso;
                    } else if (peso > maiorPesoHomens) {
                        maiorPesoHomens = peso;
                    }
                    if (peso > 100) {
                        totalHomens++;
                    }
                    break;
                case 2:
                    totalMulheres++;
                    mediaMulheres = mediaMulheres + peso;
                    break;
            }
        }
        System.out.println("Total de mulheres cadastradas: " + totalMulheres +
                "\nTotal de homens que pesam mais de 100kg: " + totalHomens +
                "\nMédia de peso entre as mulheres: " + (mediaMulheres / totalMulheres) +
                "\nMaior peso entre os homens: " + maiorPesoHomens);
    }

    public void Alghoritm69() {
        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();
        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();
        int somaTotal = 0;
        for (int i = 0; i < 10; i++) {
            somaTotal = somaTotal + primeiroTermo;
            System.out.println(primeiroTermo);
            primeiroTermo = primeiroTermo + razao;
        }
        System.out.println("Soma total: " + somaTotal);
    }

    public void Alghoritm70() {
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        for(int i = 0; i < 7; i++) {
           n1 = n2;
           n2 = n3;
           n3 = n1 + n2;
            System.out.println(n3);
        }
    }

    public void Alghoritm71() {
        int[] array = new int[8];
        for(int i = 0; i < array.length; i++) {
            array[i] = 999;
            System.out.println("[" + i + "]" + array[i]);
        }
    }

    public void Alghoritm72() {
        int[] array = new int[10];
        int valor = 5;
        for(int i = 0; i < array.length; i++) {
            array[i] = valor;
            valor = valor + 5;
            System.out.println("[" + i + "]" + array[i]);
        }
    }

    public void Alghoritm73() {
        int[] array = new int[10];
        int valor = 9;
        for(int i = 0; i < array.length; i++) {
            array[i] = valor;
            valor = valor - 1;
            System.out.println("[" + i + "]" + array[i]);
        }
    }

    public void Alghoritm74() {
        int[] array = new int[10];
        int valor = 5;
        for(int i = 0; i < array.length; i++) {
            array[i] = valor;
            if(valor == 5) {
                valor = valor - 2;
            } else {
                valor = valor + 2;
            }
            System.out.println("[" + i + "]" + array[i]);
        }
    }

    public void Alghoritm75() {
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;
        int[] array = new int[16];
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                n1 = 0;
                n2 = 1;
                array[i] = n3;
                System.out.println("[" + i + "]" + array[i]);
            } else {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                array[i] = n3;
                System.out.println("[" + i + "]" + array[i]);
            }
        }
    }

    public void Alghoritm76() {
        int[] array = new int[8];
        for(int i = 0; i < array.length; i++) {
            double rand = (Math.floor(Math.random() * 1000 + 1));
            int randInt = (int)rand;
            array[i] = randInt;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void Alghoritm77() {
        String[] array = new String[8];
        for(int i = 0; i < array.length; i++) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            array[i] = nome;
        }
        for(int i = 7; i > -1; i--) {
            System.out.println(array[i]);
        }
    }

    public void Alghoritm78() {
        int[] array = new int[16];
        for(int i = 0; i < array.length; i++) {
            System.out.print("Digite um numero inteiro: ");
            int numero = scanner.nextInt();
            array[i] = numero;
        }
        System.out.println("Valores do array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Posições do array em que estão os multiplos de 10: ");
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 10 == 0) {
                System.out.println("[" + i + "]");
            }
        }
    }

    public void Alghoritm79() {
        int[] array = new int[11];
        for(int i = 0; i < array.length; i++) {
            System.out.print("Digite um numero inteiro: ");
            int numero = scanner.nextInt();
            array[i] = numero;
        }
        System.out.println("Posiçoes dos numeros pares e valores: ");
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println("[" + i + "]" + array[i]);
            }
        }
    }

    public void Alghoritm80() {
        int[] array = new int[31];
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            double rand = (Math.floor(Math.random() * 15 + 1));
            int randInt = (int)rand;
            array[i] = randInt;
        }
        System.out.println("Digite a chave: ");
        int chave = scanner.nextInt();
        System.out.println("Posições em que a chave foi encontrada: ");
        for(int i = 0; i < array.length; i++) {
            if(chave == array[i]) {
                System.out.println("[" + i + "]");
                total++;
            }
        }
        System.out.println("Total de vezes que a chave foi sorteada: " + total);
    }

    public void Alghoritm81() {
        int[] array = new int[9];
        int media = 0;
        int maior = 0;
        int posM = 0;
        for(int i = 0; i < array.length; i++) {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            array[i] = idade;
        }
        for(int i = 0; i < array.length; i++) {
                media = media + array[i];
        }
        System.out.println("Media de idade: " + (media / array.length));
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maior) {
                maior = array[i];
                posM = i;
            }
        }
        System.out.println("Maiores idades: " + maior);
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maior) {
                maior = array[i];
            }
        }
        System.out.println("Posiçao com maior idade: " + posM);
    }

    public void Alghoritm82() {
        int[] array = new int[11];
        int media = 0;
        int maiorNota = 0;
        int posMaiorNota = 0;
        int acimaMedia = 0;
        for(int i = 0; i < array.length; i++) {
            System.out.print("Digite sua nota: ");
            int nota = scanner.nextInt();
            array[i] = nota;
            media = media + nota;
            if (maiorNota < nota) {
                maiorNota = nota;
                posMaiorNota = i;
            }
        }
        System.out.println("Média da turma: " +(media / array.length));
        for(int i = 0; i < array.length; i++) {
            if (array[i] > (media / array.length)) {
                acimaMedia++;
            }
        }
        System.out.println("Total de alunos acima da media: " + acimaMedia);
        System.out.println("Maior nota digitada: " + maiorNota + "\nPosição maior nota digitada: " + "[" + (posMaiorNota + 1) + "]");
    }

    public void Alghoritm83() {
        int[] array = new int[21];
        int aux;
        for(int i = 0; i < array.length; i++) {
            double rand = (Math.floor(Math.random() * 99 + 1));
            int randInt = (int)rand;
            array[i] = randInt;
        }
        System.out.println("Numeros gerados: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Ordenados crescentemente: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void Alghoritm84() {
        int[] menorIdade = new int[10];
        String[] nomes = new String[10];
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.println("Digite o nome: ");
            if(idade < 18) {
                String nome = scanner.next();
                nomes[i] = nome;
                menorIdade[i] = idade;
            } else {
                array[i] = idade;
            }
        }
        System.out.println("Lista de menores de idade:");
        for(int i =0; i < menorIdade.length; i++) {
            System.out.println("Pos [" + i +"]" + menorIdade[i]);
            System.out.println("Nome: " + nomes[i]);
        }
    }

    public void Alghoritm85() {
        String[] nome = new String[6];
        String[] sexo = new String[6];
        double[] salario = new double[6];
        int contador = 0;
        int aux = 0 ;
        for(int i = 0; i < 5; i ++) {
            System.out.println("Digite o nome: ");
            String name = scanner.next();
            nome[i] = name;
            System.out.println("Digite o sexo: ");
            String genero = scanner.next();
            sexo[i] = genero.toUpperCase();
            if(sexo[i].equals("FEMININO")) {
                contador++;
            }
            System.out.println("Digite o salario: ");
            double Salario = scanner.nextDouble();
            salario[i] = Salario;
        }
        int[] array = new int[contador];
        for(int i = 0; i < 5; i++) {
            if(sexo[i].equals("FEMININO")) {
                array[aux++] = i;
            }
        }
        if (contador == 1) {
            System.out.println("Não há pessoas do sexo feminino para exibir dados");
        } else {
            for(int i = 0; i < array.length; i++) {
                System.out.println("Nome: " + nome[array[i]]);
                System.out.println("Sexo: " + sexo[array[i]]);
                System.out.println("Salario : " + salario[array[i]]);
            }
        }
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