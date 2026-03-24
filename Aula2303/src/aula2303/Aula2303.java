package aula2303;
import java.util.Scanner;

public class Aula2303 {
        
    public static void main(String[] args) {
        LisEnc lista1 = new LisEnc(); 
        Scanner scanner = new Scanner(System.in);
        int resp = 0;
                
        while (resp != 5) {
            // ... Menu display ...
            resp = scanner.nextInt();
        
            switch (resp) {
                case 1 -> System.out.println(lista1.checkVazia());
                case 2 -> {
                    System.out.print("Digite o número para inserir: ");
                    int val = scanner.nextInt();
                    lista1.addElem(val);
                }
                case 3 -> lista1.remElem();
                case 4 -> lista1.showList();
                case 5 -> System.out.println("Encerrando.");
            }
        }
    }
}