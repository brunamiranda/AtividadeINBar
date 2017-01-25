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
public class Bar {
    public int PrecoComida;
    public int PrecoBebida;
    public int TempoPreparo;
    int QntComida = Mesa.getQtdComida();
    int QntBebida = Mesa.getQtdBebida();
    public Bar(int pc, int pb, int tp){
        PrecoComida = QntComida *pc;
        PrecoBebida = QntBebida * pb;
        TempoPreparo = QntComida*tp;
    }

    

   

        
}
