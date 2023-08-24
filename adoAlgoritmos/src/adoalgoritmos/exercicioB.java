/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adoalgoritmos;
import java.util.Scanner;

/**
 *
 * @author fernando.mrjesus
 */
public class exercicioB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] matrizA = new int[8];
       int [] matrizB = new int[8];
       
        System.out.println("Digite 8 valores pra matriz A:");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
        matrizA [i] = scan.nextInt();
    }
        
        for(int i =0; i < 8; i++ ) {
            matrizB[i] = matrizA[i] * 3;
        } 
        
        System.out.println("O vetor B, com os  elementos multiplicados por 3, é:");
            for (int i = 0; i< 8; i++) {
                System.out.print(matrizB[i] + "");
            }
    }
    
}
