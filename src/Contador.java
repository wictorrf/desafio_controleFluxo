import java.util.Scanner;

import javax.swing.JOptionPane;

public class Contador {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int parametroUm;
        int parametroDois;

        System.out.println("Digite o primeiro parametro: ");
        parametroUm = scan.nextInt();
        System.out.println("Digite o parametro dois: ");
        parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        boolean validacao = parametroDois > parametroUm;
        if(validacao){
            int contagem = parametroDois - parametroUm;
                for(int i = 0; i <= contagem; i++){
                    System.out.println("numero: " + i);
                }
        } else {
            throw new ParametrosInvalidosException(parametroUm, parametroDois);
        }
    }
}

