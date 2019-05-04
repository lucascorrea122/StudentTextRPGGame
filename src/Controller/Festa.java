/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Estudante;
import java.util.Scanner;

/**
 *
 * @author LucasCorrea
 */
public class Festa {

    public void divisao() {
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }

    public int useScanner() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    GameOver over = new GameOver();
    Hospital hospital = new Hospital();
    Casa casa = new Casa();

    public void festa(Estudante estudante) {
        System.out.println("Você está na festa, a música está boa e você está interagindo com todos.");
        divisao();
        System.out.println("Você está com cede e decide ir até o bar comprar refrigerante, porém no meio do caminho.");
        System.out.println("Uma pessoa o aborda e oferece droga, você aceita?");
        System.out.println("Opção 1: Não");
        System.out.println("Opção 2: Sim");
        divisao();
        System.out.print("Opção: ");
        int opcao = useScanner();
        if (opcao == 1) {
            casa.venceu(estudante);
        } else {
            System.out.println("Você fez uma péssima escolha");
            System.out.println("Acabou ingerindo produtos desconhecidos passou mal e foi para o hospital");
            divisao();
            estudante.perderSaude(40);
            hospital.cuidados(estudante);

        }

    }

}
