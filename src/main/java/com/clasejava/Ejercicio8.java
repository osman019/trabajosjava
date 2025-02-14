import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        String s = teclado.nextLine();

        
        int start = teclado.nextInt();
        int end = teclado.nextInt();

       
        System.out.println(s.substring(start, end));

        teclado.close();
    }
}
