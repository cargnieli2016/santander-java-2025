import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo valor: ");
        var value2 = scanner.nextInt();

        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);
        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);
        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);
        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);

        System.out.println("\n");

        System.out.println("Informe o primeiro valor pra calcular o resto da divisão. ");
        var value3 = scanner.nextInt();
        System.out.println("Informe o segundo valor pra calcular o resto da divisão. ");
        var value4 = scanner.nextInt();
        System.out.printf("%s %% %s = %s\n", value3, value4, value3 % value4);

    }
}