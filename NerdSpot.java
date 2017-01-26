/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nerdspot;


import java.util.Scanner;
import java.util.Random;
import static nerdspot.Mesa.NumMesa;
public class NerdSpot {

    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        Bar bar = new Bar();
        
        Random random = new Random();
        Mesa.NumMesa = random.nextInt(30);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe a quantidade de Pessoas na Mesa: ");
        Mesa.QtdPessoas = scanner.nextInt();
        System.out.printf("Informe a quantidade de Pratos na Mesa: ");
        Mesa.QtdComida = scanner.nextInt();
        System.out.printf("Informe a quantidade de Bebidas na Mesa: ");
        Mesa.QtdBebida = scanner.nextInt();
        System.out.printf("Informe a forma de pagamento: ");
        Bar.Pagamento = scanner.next();
        scanner.nextLine();
        System.out.printf("\nNúmero da mesa: ", NumMesa);
        System.out.printf("\nPessoas na mesa: ", Mesa.QtdPessoas);
        System.out.printf("\nQuantidades de pratos: ", Mesa.QtdComida);
        System.out.printf("\nQuantidades de bebidas: ", Mesa.QtdBebida);
        System.out.printf("\nTempo de Preparo: ", Bar.TempoPreparo);
        System.out.printf("\nForma de Pagamento: ", Bar.Pagamento);
        System.out.printf("\nTotal: ", Bar.Total);
        
    }
    
}
