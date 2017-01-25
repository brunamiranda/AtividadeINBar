/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nerdspot;

/**
 *
 * @author Bruna
 */
public class Mesa {

    
    private int QntPessoas;
    private int NumMesa;
    static int QtdComida;
    static int QtdBebida;
    
    public Mesa(int qp, int nm, int com, int beb){
        QntPessoas = qp;
        NumMesa = nm;
        QtdComida = com;
        QtdBebida = beb;
    }
    static int getQtdComida() {
        return QtdComida;
    }
    static int getQtdBebida() {
        return QtdBebida;
    }

    
}
