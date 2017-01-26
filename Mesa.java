/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nerdspot;

import java.util.Random;

public class Mesa {

    
    static int QtdPessoas;
    static int NumMesa;
    static int QtdComida;
    static int QtdBebida;
    
    public void Mesa(int qp, int nm, int com, int beb){
        Random random = new Random();
        QtdPessoas = qp;
        NumMesa = random.nextInt(30);
        QtdComida = com;
        QtdBebida = beb;
    }
    static int getQtdComida() {
        return QtdComida;
    }
    static int getQtdBebida() {
        return QtdBebida;
    }
    public String toString(){
        return " "+NumMesa+" "+QtdPessoas+" "; 
    }
    

    
}
