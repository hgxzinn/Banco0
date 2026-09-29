/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.banco;

/**
 *
 * @author henry61623916
 */
public class Banco {

    public static void main(String[] args){
        Contapj pj = new Contapj ("12.345.678/0001-90", "Enzo", 2.500);
        pj.apresentar();
        
        Contapf pf = new Contapf ("465.340.002-70", "Tiago", 35.000);
        pf.apresentar();
        
   
    }
}
