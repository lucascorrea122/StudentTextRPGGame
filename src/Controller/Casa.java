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
public class Casa {

    // Scanner entrada = new Scanner(System.in);
    int opcaoInicio = 666;
    Delegacia acaoDelegacia = new Delegacia();
    Faculdade acaoFaculdade = new Faculdade();
    //Estudante estudante = new Estudante( );

    /**
     * Códico inicial do jogo
     *
     * @param estudante
     *
     *
     */
    public int useScanner() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public void divisao() {
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }

    public void inicioJogo(Estudante estudante) {
        System.out.println("PRIMMMMMMMMMM...");
        System.out.println("PRIMMMMMMMMMM...");
        System.out.println("PRIMMMMMMMMMM...");
        System.out.println("É seu primeiro dia na grande capital e são 06:30 da manhã.");
        System.out.println("Sua faculdade fica do outro lado da cidade e você\nnão fez nenhuma atividade"
                + " essencial do dia-a-dia, além disso você está atrasado.\nO ônibus para faculdade sai as 07:20"
                + "e fica a 30 minutos da sua casa e o trêm sai as 07:40 e fica a 10 minutos");
        divisao();
        System.out.println("Quais serão suas primeiras atividades do dia?");
        System.out.println("Opção 1: Tomar banho!");
        System.out.println("Opção 2: Tomar café!");
        System.out.println("Opção 3: Escovar os dentes!");
        this.opcaoInicio = useScanner();
        switch (opcaoInicio) {
            case 1:
                banho(estudante);
                sairCasa(estudante, 1);
                break;
            case 2:
                café(estudante, 0);
                sairCasa(estudante, 1);
                break;
            case 3:
                escovarDentes(estudante);
                sairCasa(estudante, 1);
                break;
            default:
        }

    }

    public void statusJogo(Estudante estudante) {
        System.out.println("Seu dinheiro é: " + estudante.getDinheiro());
        System.out.println("o jogo ja se passou " + Calendario.dia);
    }

    public void banho(Estudante estudante) {
        divisao();
        System.out.println("Craasssshhhhhh");
        System.out.println("Opa... Café da manhã é a atividade mais essencial para um ser humano,"
                + "você acabou de levar um choque no chuveiro e perdeu 5 pontos de saude.");
        estudante.perderSaude(5);
        System.out.println("Sua saude atual: " + estudante.getSaude());
    }

    public void café(Estudante estudante, int nroCafe) {
        divisao();
        System.out.println("Parabéns, o café é a refeição mais importante no dia-a-dia de um ser humano.");
        System.out.println("Você acaba de ganhar saude e força");
        estudante.ganharSaude(10);
        estudante.ganharForca(3);
    }

    public void escovarDentes(Estudante estudante) {
        divisao();
        System.out.println("Higenização bucal é exencial, porém o café da manhã é a refeição mais essencial de "
                + "um ser humano.\nPelo menos você não irá apanhar na rua caso se aproxime muito "
                + "de alguém.");
    }

    public void sairCasa(Estudante estudante, int nroRua) {
        divisao();
        if (nroRua == 1) {
            System.out.println("É sua primeira vez na rua, você pode pegar ônibus ou metrô para ir a faculdade.");
            System.out.println("O ponto de Õnibus é mais barato porém é mais longe e você corre riscos de ser assaltado,"
                    + "além disso você não conhece muito bem a cidade:");
            divisao();
            System.out.println("Você deseja ir de ônibus ou Trêm?");
            System.out.println("Digite 1 para ônibus:");
            System.out.println("Digite 2 para Trêm:");
            System.out.print("Opção: ");
            int opcao = useScanner();
            divisao();
            switch (opcao) {

                case 1:

                    System.out.println("Está não foi um boa escolha, o caminho é longo e parece perigoso.");
                    System.out.println("Você saiu andando em direção ao ponto de ônibus....");
                    System.out.println("Olhe mais a frente...observe as pessoas ao seu redor, sim é a CRACOLÂNCIAA");
                    System.out.println("CRA - CO - LÂN - DIA");
                    divisao();
                    System.out.println("Você se assusta e sai correndo sem rumo.");
                    System.out.println("Calmaa, você está cansado é melhor para um pouco para descansar...");
                    System.out.println("PARADOO!!! É um ASSALTOO!!!");
                    divisao();
                    System.out.println("Sua cabeça está doendo, você levou uma coronhada!");
                    System.out.println("Você procurou sua carteia e não encontou, sorte que tinha apenas R$ 20,00 reais");
                    System.out.println("Sua saude foi reduzida");
                    estudante.perderSaude(40);
                    System.out.println("Sua saude atual é: " + estudante.getSaude());
                    estudante.debitar(20);
                    divisao();
                    System.out.println("Você deseja ir registrar ocorrência?");
                    System.out.println("Opção 1: Sim");
                    System.out.println("Opção 2: Não");
                    divisao();
                    System.out.print("Opção: ");
                    int opcaoDelegacia = useScanner();
                    switch (opcaoDelegacia) {
                        case 1:
                            System.out.println("Você está indo para a delegacia:");
                            acaoDelegacia.situacaoDelegacia(estudante);
                            break;
                        case 2:
                            System.out.println("Você cometeu um grande erro por isso sua saude foi reduzida, siga para a faculdade");
                            estudante.perderSaude(15);
                            System.out.println("Sua saude atual é: " + estudante.getSaude());
                           
                            acaoFaculdade.aula1(estudante);
                            acaoFaculdade.aula2(estudante);
                            acaoFaculdade.ru(estudante);
                    }
                    break;
                case 2:

                    System.out.println("Está foi um ótima escolha pois você está atrasado");
                    System.out.println("Você não sabe para qual estação deseja ir. deseja pedir ajuda?");
                    System.out.println("Opção 1: Sim");
                    System.out.println("Opção 2: Não");
                    System.out.println("Opção: ");
                    int opcaoAjuda = useScanner();
                    switch (opcaoAjuda) {
                        case 1:
                            if (opcaoInicio == 666) {
                                divisao();
                                System.out.println("Você não escovou os dentes e se aproximou demais para pedir informação.");
                                System.out.println("Acabou apanhado e perdeu 10 pontos de saúde");
                                estudante.perderSaude(10);
                                System.out.println("Sua saùde: " + estudante.getSaude());
                                divisao();
                                System.out.println("Mas não fique triste, você recebeu a informação e já está indo para a faculdade!");
                                divisao();
                                acaoFaculdade.aula1(estudante);
                                acaoFaculdade.aula2(estudante);
                                acaoFaculdade.ru(estudante);
                            } else {
                                divisao();
                                System.out.println("Você recebeu a informação desejada e está a caminho da faculdade.");
                                acaoFaculdade.aula1(estudante);
                                acaoFaculdade.aula2(estudante);
                                acaoFaculdade.ru(estudante);
                            }
                            break;
                        case 2:
                            divisao();
                            System.out.println("Você acabou sendo orgulhoso e está exausto de tanto dar voltas");
                            System.out.println("Você encontrou seu destino, mas perdeu 15 pontos de saúde");
                            estudante.perderSaude(15);
                            System.out.println("Saúde atual: " + estudante.getSaude());
                            System.out.println("Mas não fiquei triste, você está a caminho da faculdade");
                            acaoFaculdade.aula1(estudante);
                            acaoFaculdade.aula2(estudante);
                            acaoFaculdade.ru(estudante);
                            break;
                        default:
                            System.out.println("");

                    }
            }
        }

    }

    public void venceu(Estudante estudante) {
        divisao();
        System.out.println("Parabéns, você retornou a sua casa, venceu!");
        System.exit(0);
    }

}
