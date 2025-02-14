import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // para leitura do nome que será digitado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

// loop para repetir o nome digitado 10 vezes
        int quantidade = 1;
        while (quantidade <= 10) {
            System.out.println(quantidade + ": " + nome);
            quantidade++;
        }

        scanner.close();
    }
}
