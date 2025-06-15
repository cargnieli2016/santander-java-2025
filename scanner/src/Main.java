import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, Digite seu nome: ");
        String name = scanner.next();


        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.printf("Olá %s sua idade é %s\n", name, age);


    }
}