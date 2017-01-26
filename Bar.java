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
    static int PrecoComida;
    static int PrecoBebida;
    static int TempoPreparo;
    static String Pagamento;
    int QntComida = Mesa.getQtdComida();
    int QntBebida = Mesa.getQtdBebida();
    
    public void Bar(int pc, int pb, int tp, String pgt){
        PrecoComida = QntComida *20;
        PrecoBebida = QntBebida * 10;
        TempoPreparo = QntComida*15;
        Pagamento = pgt;
    }
    static int Total = PrecoComida+PrecoBebida;
}

