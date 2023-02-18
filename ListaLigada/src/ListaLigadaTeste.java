
import classes.ListaLigada;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author brian
 */
public class ListaLigadaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);
        
        lista.adiciona("marcelo");
        System.out.println(lista);
        
        lista.adiciona(3, "gabriel");
        System.out.println(lista);
        
        Object x = lista.pega(2);
        System.out.println(x);
        
        lista.removeDoComeco();
        System.out.println(lista);
    }
    
}
