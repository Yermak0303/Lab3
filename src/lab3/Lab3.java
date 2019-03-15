/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author 1710511
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    System.out.println("введите количество элементов");
    int num = s.nextInt();
    int a[] = new int[num];
    System.out.println("введите элементы");
    for (int i = 0; i < num; i++) {
        a[i] = s.nextInt();
    }
    System.out.println("Элементы в обратном порядке");
    for (int i = a.length - 1; i >= 0; i--) {
        System.out.println(a[i]);
        
        // TODO code application logic here
    }
    }
}
