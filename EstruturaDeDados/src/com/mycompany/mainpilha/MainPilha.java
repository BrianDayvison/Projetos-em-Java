package com.mycompany.mainpilha;

import classes.Pilha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author brian
 */
public class MainPilha {

    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();
        
        pilha.insere("Mauricio");
        System.out.println(pilha);

        pilha.insere("Guilherme");
        System.out.println(pilha);
    
        pilha.remove();
        System.out.println(pilha);

        pilha.remove();
        System.out.println(pilha);
        
        System.out.println(pilha.vazia());
    
    }
}
/*
O Java também já possui uma Classe própria para pilhas, cujo nome é Stack. 
Substituindo os nomes de nossos métodos para os da Classe do Java, temos:

insere -> push
remove -> pop
Podemos escrever no arquivo de teste:

Stack<String> stack = new Stack<String>();
stack.push("Mauricio");
stack.push("Marcelo");

System.out.println(stack);COPIAR CÓDIGO
O quê imprime [Mauricio, Marcelo]. E para remover:

stack.pop();
System.out.println(stack);COPIAR CÓDIGO
O quê imprime [Mauricio].

##Método peek

Como vimos, o pop remove o último elemento da pilha. O método peek trabalha em 
cima desse elemento também, porém sem removê-lo. Ele apenas o retorna. Se temos,
então, a pilha [Mauricio, Marcelo],

String nome = stack.peek();
System.out.println(nome);COPIAR CÓDIGO
nos retorna Marcelo.

Usabilidade das pilhas
O conceito de pilhas é muito utilizado por compiladores e autômatos. 
Esta estrutura de dados tem muita usabilidade em ciência da computação. 
O próprio, e muito conhecido, comando "Desfazer" dos editores de texto, 
de código, de imagens, etc tem como base as pilhas. 
Podemos também brincar com palavras e inverter a ordem de suas letras 
utilizando as pilhas.
*/