import java.util.Scanner;

public class Desafio2 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada e separa em nome e tipo de conta
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        if(nome.equals("Ana")){
            System.out.printf("Bem-vindo(a), Ana! Sua conta %s esta pronta para uso.", tipoConta);
        } else if(nome.equals("Lucas")){
            System.out.printf("Bem-vindo(a), Lucas! Sua conta %s esta pronta para uso.", tipoConta);
        } else if(nome.equals("Joao")){
            System.out.printf("Bem-vindo(a), Joao! Sua conta %s esta pronta para uso.", tipoConta);
        } else if (nome.equals("Maria")){
            System.out.println("Tipo de conta invalido.");
        }
    }
}
