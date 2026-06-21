import java.util.Scanner;

public class Desafio {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Digite Primeiro o Saldo: ");
        int saldo = scanner.nextInt();
        //System.out.println("Digite o Valor da Transição: ");
        int valorTransacao = scanner.nextInt();

        if (valorTransacao > saldo){
            System.out.println("Saldo Insuficiente!");
        } else {
            System.out.println("Transição Aprovada!");
        }
    }
}
