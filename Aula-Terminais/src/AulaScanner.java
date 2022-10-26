import java.util.Locale;
import java.util.Scanner;

public class AulaScanner {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá, meu nomé é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E minha altura é " + altura);
    }
}
