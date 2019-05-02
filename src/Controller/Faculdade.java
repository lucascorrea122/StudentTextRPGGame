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
 * @author Flavia Amin
 */
public class Faculdade {

    public int useScanner() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    int resposta;
    GameOver acaoOver = new GameOver();
    Cracolandia craco = new Cracolandia();
    int diaFaculdade = 0;
    Amigo amigo = new Amigo();

    public void chegouFaculdade(Estudante estudante) {
        System.out.println("Você chegou na faculdade!");

    }

    public void aula2(Estudante estudante) {
        System.out.println("Voce entra na sala de aula e seu professor está entregando as provas da aula passada");
        System.out.println("Vá até a mesa dele pegar a sua");
        System.out.println("O QUE? Você tirou 2 na prova.");
        System.out.println("Você acha que sua prova está mal corrigida, questiona o professor porém o mesmo faz pouco caso");
        System.out.println("Você então planeja vingar-se dele pixando seu carro:");
        System.out.println("Você pixa?");
        System.out.println("Opção 1: Sim");
        System.out.println("Opção 2: Não");
        int opcao = useScanner();
        if (opcao == 1) {
            System.out.println("Você é um delinquente juvenil, foi preso HAHAHAHA");
            acaoOver.gameOver();
        } else if (opcao == 2) {
            System.out.println("Parabéns você não é delinquente!");
        }

    }

    public void ru(Estudante estudante) {

        System.out.println("Você chegou no resturante após uma longa manhã conturbada!");
        System.out.println("Após servi-se olha para as mesas disponiveis");
        System.out.println("Você tem duas mesas disponiveis:");
        System.out.println("opção 1: sentar-se em uma mesa vazia");
        System.out.println("opção 2: sentar-se em uma mesa com seus colegas de classe");
        System.out.println("Digite sua escolha:");
        resposta = useScanner();
        if (resposta == 1) {
            System.out.println("Você percebe que não tem amigos");
            System.out.println("A depressão bate, você levanta e vai pra cracolândia");
            craco.depreLandia(estudante);
        } else if (resposta == 2) {
            System.out.println("Você acabou socializando e fez grandes amigos, em especial um, Luciano");
            System.out.println("Luciano convidou você para ir para casa dele fazer uma interação com amigos sexta a noite");
            System.out.println("Você deseja ir?");
            System.out.println("Opção 1: SIM");
            System.out.println("Opção 2: NÂO");
            System.out.print("Opção:");
            int opcaoAmigo = useScanner();
            if (opcaoAmigo == 1) {
                amigo.interacaoAmigo(estudante);
                amigo.sobreviveuAteMomento(estudante);
            } else if (opcaoAmigo == 2) {
                craco.depreLandia(estudante);
            }

        }

    }

    public void statusFaculdade() {
        System.out.println("Você veio " + diaFaculdade + " dias a faculdade");

    }

    public void aula1(Estudante estudante) {

        System.out.println("---------Você entra na sala de aula e seu professor saiu, antes de sair------------------------\n"
                + "---------ele deixou uma equação numérica para que resolvam, seus amigos então fazendo----------\n"
                + "---------um bolão para quem acertar primeiro a questão, o vencedor ganha 20 reais--------------\n");

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("------------------Qual o resultado da equação a seguir: ---------------------");
        System.out.println("                         Questão 1: 18x = 65 + 43");
        resposta = useScanner();

        if (resposta == 6) {
            System.out.println("Muito bem, resultado correto, pegue seu dinheiro!");
            estudante.ganhardinheiro(20.0);
            System.out.println("Seu saldo atual é: " + estudante.getDinheiro());
        } else {
            System.out.println("Resultado errado, deixou de ganhar 20 reais");
            System.out.println("Além de errar a resposta se irritou e  acabou tendo um ataque no miocardio");
            System.out.println("Você 35 pontos de saúde");
            estudante.perderSaude(60);
            if (estudante.getSaude() < 0) {
                System.out.println("Sua saúde chegou ao negátivo!");
                acaoOver.gameOver();
            }

        }

    }

}
