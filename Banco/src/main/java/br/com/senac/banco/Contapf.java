/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author henry61623916
 */
public class Contapf extends Pessoa{
    private String cpf;
    
public String getcpf (){
    return this.cpf;
    
}

public void setcpf(String cpf){
    this.cpf = cpf;
}
public Contapf(String cpf, String titular, Double saldo){
    super(titular,saldo);
    this.cpf = cpf;
    
}
@Override
public void apresentar(){
    System.out.println("Olà, sou o titular pf:  " + this.gettitular());
}
    
    
     

    
}
