
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numeros;

        numeros = leia.nextDouble();
        for (int i = 1; i <= numeros; i = i + 2) {
            System.out.println(i);
        }
    }
}
