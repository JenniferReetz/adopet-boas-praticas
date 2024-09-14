package br.com.alura;

import javax.swing.plaf.synth.SynthButtonUI;
import java.util.Scanner;

public class AdopetConsoleApplication {

    public static void main(String[] args) {
        CommandExecute execute = new CommandExecute();
        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
                exibeMenu();
                String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);
                switch (opcaoEscolhida){
                    case 1 -> execute.executeCommand(new ListarAbrigoCommand());
                    case 2 -> execute.executeCommand(new CadastrarAbrigoCommand());
                    case 3 -> execute.executeCommand(new ListarPetsDoAbrigoCommand());
                    case 4 -> execute.executeCommand(new ImportarPetsDoAbrigoCommand());
                    case 5 -> System.exit(0);
                    default -> opcaoEscolhida = 0;
                }
            }
            System.out.println("Finalizando o programa...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void exibeMenu(){
        System.out.println("""
                \nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:
                1 -> Listar abrigos cadastrados
                2 -> Cadastrar novo abrigo
                3 -> Listar pets do abrigo
                4 -> Importar pets do abrigo
                5 -> Sair
                """);
    }
}
