/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinhadosucesso;

/**
 *
 * @author Candido
 */
public class Pessoa {
    String nome;
    String endereco;
    String telefone;
    
    public Pessoa(String nome,String endereco,String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }
    
    void imprimir(){
        
        System.out.println(" o nome é:"+this.nome+ "\n o endereço é:"+this.endereco+ "\n o telefone é:"+this.telefone);
    }
       
}

