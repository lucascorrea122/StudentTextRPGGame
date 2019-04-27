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
public class Hospital {
    
    GameOver over = new GameOver();
    Casa casa = new Casa();
    
    public void cuidados(Estudante estudante){
        if (estudante.getSaude() < -20 ) {
            System.out.println("Não foi possível tratar você");
            over.gameOver();
        }else if(estudante.getSaude() > -20){
            System.out.println("Você conseguiu escapar por pouco, foi tratado e levado para casa");
            casa.venceu(estudante);
        }
        
    
    
    }
    
}
