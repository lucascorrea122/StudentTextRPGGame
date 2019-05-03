/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Estudante;
import Model.Locais;


/**
 *
 * @author LucasCorrea
 */
public class Cracolandia {
    
    
    GameOver over = new  GameOver();
    
    public void depreLandia(Estudante estudante){
        System.out.println("Você  esta desanimado com a vida, não tem mais vontade de estudar e a vida social anda mal");
        System.out.println("Você passou 3 dias em diversos lugares com pessoas estranhas e gastou todo quase todo seu dinheiro com drogas");
        estudante.setDinheiro(0);
        System.out.println("Seu saldo: "+ estudante.getDinheiro() );
        over.gameOver();
        
    
    }
    
}
