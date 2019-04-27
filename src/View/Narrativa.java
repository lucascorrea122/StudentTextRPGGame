package View;

import Controller.Casa;
import Controller.Metro;
import Controller.Rodoviaria;
import java.util.Scanner;
import Model.Estudante;
import Model.Estudante;
import Model.Locais;

/**
 * @author Flávia
 */
public class Narrativa {

    //Estudante estudante = new Estudante();
    //<editor-fold defaultstate="collapsed" desc="Controladores">
   
    //</editor-fold>

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estudante estudante = new Estudante();
        
         Rodoviaria acaoRodoviaria = new Rodoviaria();
         Metro acaoMetro = new Metro();
         Casa casa = new Casa();
        
        System.out.println("BEM VINDO AO *******");
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Continuar Jogo");
        System.out.println("3 - Conhecer um pouco mais da história");
        System.out.println("4 - Sair");
        System.out.println("-------------------------");

        int menu = entrada.nextInt();
        switch (menu) {
            case 1:
                casa.inicioJogo(estudante);
                break;
            case 2:
                System.out.println("xxxx");
                break;
            case 3:
                System.out.println("************** No ano de 2019 um aluno teve uma ótima nota no vestibular********************\n"
                        + "************** e deseja cursar Gastronomia, com isto o mesmo necessita escolher*************\n"
                        + "************** uma cidade que é ofertada o curso, após sua escolha, o estudante tem*********\n"
                        + "***************que se adaptar à nova rotina. Dentre todas opções, ele decide a cidade*******\n"
                        + "***************de São Paulo, onde possui o índice de violência muito alto, trânsito*********\n"
                        + "***************caótico, descolamento demasiado lento e longo, alto custo de vida e**********\n"
                        + "***************poluição. No meio dessa trama toda, o aluno deverá optar pelas melhores******\n"
                        + "***************escolhas que ocasionarão na sua melhor  sua adaptação, onde tais*************\n"
                        + " **************escolhas afetarão diretamente no seu cotidiano, e futuras escolhas.**********\n");
                break;

            default:
                System.out.println("");

        }
    }
}
