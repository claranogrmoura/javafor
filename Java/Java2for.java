/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java2for;

/**
 *
 * @author Admin
 */import java.util.Scanner;
public class Java2for {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

       
        System.out.println("Tabela de Quadrados:");
        System.out.println("Número\tQuadrado");
        for (int i = 1; i <= numero; i++) {
            int quadrado = i * i;
            System.out.println(i + "\t" + quadrado);
        }

        scanner.close();
    }
}
5333333333333
