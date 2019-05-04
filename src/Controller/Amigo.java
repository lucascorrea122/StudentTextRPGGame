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
public class Amigo {

    public void divisao() {
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }

    public int useScanner() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public void interacaoAmigo(Estudante estudante) {
        GameOver over = new GameOver();
        divisao();
        System.out.println("Você chega na casa do Luciano, após alguns minutos chegam mais algumas pessoas.");
        System.out.println("Todos acabam interagindo e ingerindo bebidas álcolicas, você acaba passando um pouco dos limites,"
                + "e sua lucidez acaba sendo reduzida pela metade");
        estudante.perderLucidez(40);
        System.out.println("Sua lucidez: " + estudante.getLucidez());
        divisao();
        System.out.println("Vocês acabam decidindo fazer um jogo de perguntas e respostas.");
        System.out.println("Quem perder deve tomar um dose de Absinto, ao tomar esta dose sua saude é reduzida em 10 pontos de saúde");
        System.out.println("PRONTO???");
        System.out.println("Pergunta UM - De quem é a famosa frase “Penso, logo existo”?");
        System.out.println("Opção 1: Platão");
        System.out.println("Opção 2: Sócrates");
        System.out.println("Opção 3: Descartes");
        System.out.print("Opção:  ");
        int questao1 = useScanner();
        if (questao1 == 3) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou!");
            estudante.perderSaude(10);
            if (estudante.getSaude() < 0) {
                over.gameOver();
            }
        }

        System.out.println("Pergunta DOIS - De onde é a invenção do chuveiro elétrico?");
        System.out.println("Opção 1: França");
        System.out.println("Opção 2: Brasil");
        System.out.println("Opção 3: Inglaterra");
        int questao2 = useScanner();
        if (questao2 == 2) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou!");
            estudante.perderSaude(10);
            if (estudante.getSaude() < 0) {
                over.gameOver();
            }
        }

        System.out.println("Pergunta TRÊS - Em que região se situa Macapá?");
        System.out.println("Opção 1: Nordeste");
        System.out.println("Opção 2: Norte");
        System.out.println("Opção 3: Centro-Oeste");
        int questao3 = useScanner();
        if (questao3 == 2) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou!");
            estudante.perderSaude(10);
            if (estudante.getSaude() < 0) {
                over.gameOver();
            }
        }

    }

    public void sobreviveuAteMomento(Estudante estudante) {
        divisao();
        Festa festa = new Festa();
        System.out.println("Você está indo bem no jogo até o momento, porém sua saúde está quase no final. Cuidado!!!");
        System.out.println("Sua saúde: " + estudante.getSaude());
        divisao();
        System.out.println("Vocês decidiram ir a festa.");
        divisao();
        festa.festa(estudante);

    }
}
