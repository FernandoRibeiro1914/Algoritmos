/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adoalgoritmos;
import java.util.Scanner;
/**
 * @author fernando.ribeiro
 */
//Exercicio A
public class AdoAlgoritmos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []vetor = new int[10];
        
        System.out.println("Digite 10 Nº:");
        
        for(int i = 0; i < 10; i++) {
            vetor[i] = scan.nextInt();
        }
        
        System.out.println("Elementos digitados:");
        for (int i = 0; i < 10; i++) {
        System.out.println(vetor[i] + " ");   
    }
    }
}
    

