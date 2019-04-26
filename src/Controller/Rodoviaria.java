/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Estudante;
import Model.Locais;
import View.Narrativa;

/**
 *
 * @author LucasCorrea
 */
public class Rodoviaria {
 
       
    
       public void pegarOnibus(Estudante estudante) {
        estudante.debitar(2.50);
        estudante.visitarLocal(Locais.onibus);
        System.out.println("Seu saldo atual é: " + estudante.getDinheiro());
        estudante.visitarLocal(Locais.faculdade);
        System.out.println("você chegou na faculdade, hora de estudar!");

    }
    
}
