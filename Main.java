public class Main {
    public static void main(String[] args) {
        try {
            int valor = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println("Linea " + element.getLineNumber());
            }
        }

    }



}