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
    
    int diaFaculdade = 0;
    
    Scanner entrada = new Scanner(System.in);
    public void chegouFaculdade(Estudante estudante){
        System.out.println("Você chegou na faculdade!");
    

        System.out.println("---------Você entra na sala de aula e seu professor saiu, antes de sair------------------------\n"
                + "---------ele deixou uma equação numérica para que resolvam, seus amigos então fazendo----------\n"
                + "---------um bolão para quem acertar primeiro a questão, o vencedor ganha 20 reais--------------\n");
        int resposta;
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("------------------Qual o resultado da equação a seguir: ---------------------");
        System.out.println("                         Questão 1: 18x = 65 + 43"                                   );
        resposta = entrada.nextInt();

        if (resposta == 6) {
            System.out.println("Muito bem, resultado correto, pegue seu dinheiro!");
            estudante.ganhardinheiro(20);
            System.out.println("Seu saldo atual é: " + estudante.getDinheiro());
        } else {
            System.out.println("Resultado errado, deixou de ganhar 20 reais");
            
        }

    }

    public void aula2() {

    }

    public void Ru() {

    
    }
    
    public void statusFaculdade(){
        System.out.println("Você veio "+ diaFaculdade +" dias a faculdade");
    
    }
    
    
    
}
