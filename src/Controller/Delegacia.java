/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.GameOver;
import Model.Estudante;

import java.util.Scanner;

/**
 *
 * @author LucasCorrea
 */
public class Delegacia {

    public void divisao() {
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }

    public int useScanner() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    GameOver acaoOver = new GameOver();
    Faculdade acaoFaculdade = new Faculdade();

    public void registrarOcorrencia() {
        System.out.println("Você registrou a ocorrência do assalto e foi para a faculdade");
        System.out.println("ATRASADO");
    }

    public void situacaoDelegacia(Estudante estudante) {
        divisao();
        System.out.println("Você está na sala de espera muito tempo, incomodado levanta para reclamar da situação");
        System.out.println("Você aumenta o tom de voz com o policial, o mesmo solicita que você se acalme.");
        System.out.println("Você se acalma?");
        System.out.println("Opção 1: sim");
        System.out.println("Opção 2: Não");
        divisao();
        System.out.print("Opção: ");
        int opcao = useScanner();
        if (opcao == 1) {
            registrarOcorrencia();
            acaoFaculdade.aula1(estudante);
            acaoFaculdade.aula2(estudante);
            acaoFaculdade.ru(estudante);
        } else if (opcao == 2) {
            System.out.println("Você desrepeitou uma autoridade e foi Preso.");
            System.out.println("Você acabou se extressando mais ainda e brigou na cela com os presos, gerou um briga e morreu");
            System.out.println("GAME-OVER");
            acaoOver.gameOver();

        }

    }

}
