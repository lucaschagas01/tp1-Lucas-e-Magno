/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatojoava;

/**
 *
 * @author aluno
 */
public class Gatojoava {
    boolean macho;
    String nome;
    int idade;
    Gatojoava raça;
    public Gatojoava (String n){
             this.nome= n;
    }
    public void mauu (){
        if (idade >=2){
            System.out.print ("mauu");
    }else{
            System.out.print ("miauuuu");
           }
    }
}   
   