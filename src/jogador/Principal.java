/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Jogador> time = new ArrayList<Jogador>();
        
        for(int i = 1;i <= 11;i++){
            System.out.println("Digite o nome, posição, peso, altura e o número da camisa do jogador: ");
            
            String nome = entrada.next();
            String posicao = entrada.next();
            double peso = entrada.nextDouble();
            double altura = entrada.nextDouble();
            int numCamisa = entrada.nextInt();
            
            time.add(new Jogador(nome, posicao, peso, altura, numCamisa));
        }
        for(int i = 0;i <= 10;i++){
           System.out.println((i+1) + "o jogador: "+ time.get(i)+"\n");
        }
    }
    
}
