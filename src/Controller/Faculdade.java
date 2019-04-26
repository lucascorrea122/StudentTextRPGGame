/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Estudante;
/**
 *
 * @author LucasCorrea
 */
public class Faculdade {
    
    int diaFaculdade = 0;
    
    public void chegouFaculdade(Estudante estudante){
        System.out.println("Você chegou na faculdade!");
    
    }
    
    public void statusFaculdade(){
        System.out.println("Você veio "+ diaFaculdade +" dias a faculdade");
    
    }
    
    
    
}
