import java.util.Scanner;

public class Exe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor convertido para tipo wrapper: " + valorWrapper);

        scanner.close();
    }
}
