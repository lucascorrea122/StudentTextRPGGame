/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Estudante;
import Model.Locais;
import javax.swing.JFrame;
import Controller.Calendario;
import java.util.Scanner;

/**
 *
 * @author LucasCorrea
 */
public class Casa {
    
    Scanner entrada = new Scanner(System.in);
    
    
    
    public void inicioJogo(Estudante estudante){
        System.out.println("PRIMMMMMMMMMM...");
        System.out.println("PRIMMMMMMMMMM...");
        System.out.println("PRIMMMMMMMMMM...");
        System.out.println("É seu primeiro dia na grande capital e são 06:30 da manhã.");
        System.out.println("Sua faculdade fica do outro lado da cidade e você não fez nenhuma atividade"
                + "essencial do dia-a-dia, além disso você está atrasado. O ônibus para faculdade sai as 07:20"
                + "e fica a 30 minutos da sua casa e o trêm sai as 07:40 e fica a 10 minutos" );
        System.out.println("Quais serão suas primeiras atividades do dia?");
        System.out.println("Opção 1: Tomar banho!" );
        System.out.println("Opção 2: Tomar café!" );
        System.out.println("Opção 3: Escovar os dentes!");
        int opcaoInicio = entrada.nextInt();
        switch (opcaoInicio){
            case 1:
                banho(estudante);
                break;
            case 2:
                café(estudante, 0);
                break;
            case 3:
                escovarDentes(estudante);
                break;
            default:    
        }
        
         
    }
    
    public void statusJogo(Estudante estudante){
        System.out.println("Seu dinheiro é: "+ estudante.getDinheiro());
        System.out.println("o jogo ja se passou "+ Calendario.dia);
    }
    
    
    public void banho(Estudante estudante){
        System.out.println("Craasssshhhhhh");
        System.out.println("Opa... Café da manhã é a atividade mais essencial para um ser humano,"
                + "você acabou de levar um choque no chuveiro e perdeu 5 pontos de saude.");
        System.out.println("Sua saude atual: "+ estudante.getSaude());
    }
    
    
    public void café(Estudante estudante, int nroCafe){
        System.out.println("Parabéns, o café é a refeição mais importante no dia-a-dia de um ser humano.");
        System.out.println("Você acaba de ganhar 10 pontos de saúde e 0.3 pontos de força");
    }
    
    public void escovarDentes(Estudante estudante){
        System.out.println("Higenização bucal é exencial, porém o café da manhã é a refeição mais essencial de"
                + "um ser humano. Mas não fique triste pelo menos você não irá apanhar na rua caso se aproxime muito"
                + "de alguém.");
    }
    
    
    public void sairCasa(Estudante estudante, int nroRua){
        if(nroRua == 1){
            System.out.println("É sua primeira vez na rua, você pode pegar ônibus ou metrô para ir a faculdade.");
            System.out.println("O ponto de Õnibus é mais barato porém é mais longe e você corre riscos de ser assaltado,"
                    + "além disso você não conhece muito bem a cidade:");
            System.out.println("Você deseja ir de ônibus ou Trêm?");
            System.out.println("Digite 1 para ônibus:");
            System.out.println("Digite 2 para Trêm:");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Está não foi um boa escolha, o caminho é longo e parece perigoso."); 
                    System.out.println("Você saiu andando em direção ao ponto de ônibus...."); 
                    System.out.println("Olhe mais a frente...observe as pessoas ao seu redor, sim é a CRACOLÂNCIAA"); 
                    System.out.println("CRA - CO - LÂN - DIA"); 
                    System.out.println("Você se assusta e sai correndo sem rumo.");
                    System.out.println("Calmaa, você está cansado é melhor para um pouco para descansar...");
                    System.out.println("PARADOO!!! É um ASSALTOO!!!");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Sua cabeça está doendo, você levou uma coronhada!");
                    System.out.println("Você procurou sua carteia e não encontou, sorte que tinha apenas R$ 20,00 reais");
                    System.out.println("Sua saude foi reduzida em 40 pontos de saúde");
                case 2:
            }
        }
    
    }
    
    
}


