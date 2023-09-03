import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Generating the first word to the stack
        Scanner scanner = new Scanner(System.in);
        stack p = new stack();
        System.out.println("Digite a data: ");
        String frase = scanner.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            p.push(frase.charAt(i));
        }
        //Generating an equal stack from p to pop the content
        stack f;
        f = p;
        String fraseInvertida = "";
        // Inverting the word
        while (!f.isEmpty()) fraseInvertida += f.pop();
        //Comparing both sentences with .equal()
        if (frase.toLowerCase().replaceAll("/", "").equals(fraseInvertida.toLowerCase().trim().replaceAll("/", "")))
            System.out.println("Palindromes!");
        else
            System.out.println(("Not Palindromes!"));

        System.out.println(frase + " -> " + frase.toLowerCase().replaceAll("/", ""));
        System.out.println(fraseInvertida + " -> " + fraseInvertida.toLowerCase().replaceAll("/", ""));
    }
}