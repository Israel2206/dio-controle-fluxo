import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();
    
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("Digite um número");
        }
        finally{
            scanner.close();
        }
    }
    static void contar(int parametroUm, int parametroDois ) {
        if (parametroDois > parametroUm) {
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i<=contagem;i++){
                System.out.println("Imprimindo o número "+i);
            }
        }else{
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
}