/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author henry61623916
 */
public class Pessoa {
    private String titular;
    private double saldo;
    
    public String gettitular(){
        return this.titular;
    }
    public double getsaldo(){
        return this.saldo;
    }
    public void settitular(String titular){
        this.titular = titular;
    }
    public void setsaldo(Double saldo){
        this.saldo = saldo;
    }
    public Pessoa(String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public void apresentar(){
        
    }
}
