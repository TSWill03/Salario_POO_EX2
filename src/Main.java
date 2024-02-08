import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salario = 0;
        System.out.println("Digite as faltas do funcionário: ");
        int faltas = scanner.nextInt();

        System.out.println("Digite a quantidade de produtos vendidos: ");
        int produtos = scanner.nextInt();

        if (produtos > 20) {
            salario = salario + (produtos * 13);
        } else {
            salario = salario + (produtos * 10);
        }

        if (faltas > 5) {
            salario = salario * 85 / 100;
        }


        System.out.println("O salário do funcionário é: " + salario);
        /*Ler numero de faltas se falto mais que 5 vezes salario = salario * 0.85
        ler numero de produtos vendidos cada produto vale 10 se vendeu mais que 20 produtos o valor e de 13
        * */
    }
}