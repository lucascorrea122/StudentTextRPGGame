/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Locais;
import Model.Estudante;

/**
 *
 * @author LucasCorrea
 */
public class Metro {
    
 
    
    
    public void pegarMetro(Estudante estudante) {
        estudante.debitar(5.0);
        estudante.visitarLocal(Locais.metro);
        System.out.println("Seu saldo atual é: " + estudante.getDinheiro());
        estudante.visitarLocal(Locais.faculdade);
        System.out.println("você chegou na faculdade, hora de estudar!");

    }
    
}
