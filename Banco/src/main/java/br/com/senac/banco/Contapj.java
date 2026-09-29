/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author henry61623916
 */
public class Contapj extends Pessoa {
    private String cnpj;
    
    public String getcnpj(){
        return this.cnpj;
    }
    public void setcnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public Contapj(String cnpj, String titular, Double saldo){
        super(titular, saldo);
        this.cnpj = cnpj;
    }
    @Override
    public void apresentar(){
        System.out.println("Olà, sou titular pj: " + this.gettitular());
    }
    
}
