import classes.Fila;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brian
 */
public class MainFila {
    public static void main(String[] args) {
        
        Fila fila = new Fila();
        
        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");

        System.out.println(fila);
        
        String x1 = fila.remove();
        System.out.println(x1);
        System.out.println(fila);
        
        
        System.out.println(fila.vazia());
    }
}
