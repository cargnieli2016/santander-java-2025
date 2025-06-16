import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var nome = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado? (S/N) ");
        var isEmancipated = scanner.next().equalsIgnoreCase("S");

        if (age >= 18) {
            System.out.printf("%s, tem %s anos, você pode dirigir!\n", nome, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de você ter %s anos, você é emacipado e pode dirigir!\n", nome, age);

        } else {
            System.out.printf("%s, tem %s anos, você não pode dirigir!\n", nome, age);
        }
        System.out.println("\n- Fim de execução - \n");
    }
}