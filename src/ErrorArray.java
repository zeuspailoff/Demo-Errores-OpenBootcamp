import java.util.Scanner;

public class ErrorArray {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Diga el tamaño del vector: ");
            int tam = sc.nextInt();
            int num[] = new int[tam];

            for (int i = 1; i <= tam; i++) {
                System.out.print("Ingrese dato: ");
                num[i] = sc.nextInt();

            }

            System.out.println("Mostrando los datos: ");
            System.out.println();
            for (int i = 0; i < tam; ) {
                System.out.println(num[i]);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("el array es mas grande de lo requerido");
        }

    }
}
