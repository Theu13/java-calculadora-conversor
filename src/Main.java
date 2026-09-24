
import java.util.Scanner;

//inicializar scanner
Scanner reader = new Scanner(System.in);

void main(){



    //variavel de controle menu
    boolean executarMenu = true;

    //loop de menu
    while (executarMenu) {
        //executar informações menu
        Menu();

        //obter a opcao
        int opcao = reader.nextInt();

        //iniciar opcoes menu
        switch (opcao) {
            case 1 -> calculadora();
            case 2 -> conversor();
            case 0 -> executarMenu = false;
            default -> System.out.println("Opção inválida.");

        }
    }
}

void Menu() {
    System.out.println("===============");
    System.out.println("Escolha uma opção:");
    System.out.println("1: Caculadora.");
    System.out.println("2: Conversor.");
    System.out.println("0: Sair.");
    System.out.println("===============");
}

void calculadora() {

    System.out.println("===============");
    System.out.println("Bem-vindo a Calculadora!");
    boolean executarCalculadora = true;
    while (executarCalculadora) {
        calculadoraOpcoes();
        int opcaoCalculadora = reader.nextInt();
        switch (opcaoCalculadora) {
            case 1 -> {
                System.out.println("Digite o primeiro número:");
                double num1 = reader.nextDouble();
                System.out.println("Digite o primeiro segundo:");
                double num2 = reader.nextDouble();
                System.out.printf("A soma é %.2f\n", (num1 + num2));
            }
            case 2 -> {
                System.out.println("Digite o primeiro número:");
                double num1 = reader.nextDouble();
                System.out.println("Digite o primeiro segundo:");
                double num2 = reader.nextDouble();
                System.out.printf("A subtração é %.2f\n", (num1 - num2));
            }
            case 3 -> {
                System.out.println("Digite o primeiro número:");
                double num1 = reader.nextDouble();
                System.out.println("Digite o primeiro segundo:");
                double num2 = reader.nextDouble();
                System.out.printf("A multiplicação é %.2f\n", (num1 * num2));
            }
            case 4 -> {
                System.out.println("Digite o primeiro número:");
                double num1 = reader.nextDouble();
                System.out.println("Digite o primeiro segundo:");
                double num2 = reader.nextDouble();
                //System.out.printf("A divisão é %.2f\n", (num1 / num2));

                //tratamento de divisão por 0
                if (num2 == 0) {
                    System.out.println("Erro: não é possível dividir por zero.");
                } else {
                    System.out.printf("A divisão é %.2f%n", num1 / num2);
                }
            }
            case 5 -> {
                System.out.println("Digite o primeiro número:");
                double num1 = reader.nextDouble();
                System.out.println("Digite o primeiro segundo:");
                double num2 = reader.nextDouble();
                System.out.printf("A potência é %.2f\n", (Math.pow(num1, num2)));
            }
            case 6 -> {
                System.out.println("Digite o primeiro número:");
                double num1 = reader.nextDouble();
                System.out.println("Digite o primeiro segundo:");
                double num2 = reader.nextDouble();

                //tratamento se num2 for igual a 0.
                while (num2 == 0) {
                    System.out.println("O divisor não pode ser zero.");
                    System.out.println("Digite o segundo número: ");
                    num2 = reader.nextDouble();
                }

                System.out.printf("Resultado do resto da divisão é: %.2f\n", (num1 % num2));
            }
            case 0 -> executarCalculadora = false;
            default -> System.out.println("Opção inválida.");

        }
    }



}

void calculadoraOpcoes(){

    System.out.println("------------------------");
    System.out.println("Escolha sua opção: ");
    System.out.println("1: Somar.");
    System.out.println("2: Subtrair.");
    System.out.println("3: Multiplicar.");
    System.out.println("4: Dividir.");
    System.out.println("5: Potencia.");
    System.out.println("6: Resto.");
    System.out.println("0: Voltar ao Menu.");

}

void conversor() {

    System.out.println("===============");
    System.out.println("Bem-vindo ao Conversor de Unidades!");

    boolean executarConversor = true;
    while (executarConversor) {
        conversorOpcoes();
        int opcaoConversor = reader.nextInt();


        switch (opcaoConversor) {
            case 1 -> {
                System.out.println("Digite o valor: ");
                double valor = reader.nextDouble();
                System.out.printf("O valor em Fahrenheit é: %.2f\n", (valor * 1.8 + 32));
            }
            case 2 -> {
                System.out.println("Digite o valor: ");
                double valor = reader.nextDouble();
                System.out.printf("O valor em Celsius é: %.2f\n", ((valor - 32 ) / 1.8));
            }
            case 3 -> {
                System.out.println("Digite o valor: ");
                double valor = reader.nextDouble();
                System.out.printf("O valor em milhas é: %.2f\n", (valor * 0.621));
            }
            case 4 -> {
                System.out.println("Digite o valor: ");
                double valor = reader.nextDouble();
                System.out.printf("O valor em KM é: %.2f\n", (valor / 0.621));
            }
            case 5 -> {
                System.out.println("Digite o valor: ");
                double valor = reader.nextDouble();
                System.out.printf("O valor em libras é: %.2f\n", (valor * 2.205));
            }
            case 6 -> {
                System.out.println("Digite o valor: ");
                double valor = reader.nextDouble();
                System.out.printf("O valor em KG é: %.2f\n", (valor / 2.205));
            }
            case 0 -> executarConversor = false;
            default -> System.out.println("Opção inválida.");
        }

        }




}

void conversorOpcoes(){

    System.out.println("------------------------");
    System.out.println("Escolha sua conversão: ");
    System.out.println("1: Celsius ↔ Fahrenheit.");
    System.out.println("2: Fahrenheit ↔ Celsius .");
    System.out.println("3: Quilômetros ↔ milhas.");
    System.out.println("4: milhas ↔ Quilômetros.");
    System.out.println("5: Quilogramas ↔ libras.");
    System.out.println("6: libras ↔ Quilogramas.");
    System.out.println("0: Sair.");

}


