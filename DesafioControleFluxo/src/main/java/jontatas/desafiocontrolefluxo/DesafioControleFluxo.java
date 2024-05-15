/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jontatas.desafiocontrolefluxo;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class DesafioControleFluxo {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = in.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = in.nextInt();
        
        try {
            if (parametroDois > parametroUm) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        in.close(); 
    }
}
