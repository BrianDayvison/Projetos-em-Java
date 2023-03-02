/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.locomotiva.checklist;
import br.com.locomotiva.checklist.classes.Maquinista;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author brian
 */
public class ChecklistDasLocomotivas {

    public static void main(String[] args) {
        
        Maquinista m1 = new Maquinista("Brian",1);
        Maquinista m2 = new Maquinista("Matheus",2);
        Maquinista m3 = new Maquinista("Welder",3);
        
        List<Maquinista> quadroDeMaquinista = new ArrayList<>();
        quadroDeMaquinista.add(m3);
        quadroDeMaquinista.add(m2);
        quadroDeMaquinista.add(m1);
        
        System.out.println("Lista antes da ordenação: " + quadroDeMaquinista);
        for(Maquinista conta : quadroDeMaquinista ) {
            System.out.println(conta);
        }
        
        class comparadorMatricula implements Comparator<Maquinista>{

            @Override
            public int compare(Maquinista m1, Maquinista m2) {
                if(m1.getMatricula() < m2.getMatricula()) {
                    return -1;
                }

                if(m1.getMatricula()> m2.getMatricula()) {
                    return 1;
                }

                return 0;
            }
        }
       comparadorMatricula comparator = new comparadorMatricula(); 
       quadroDeMaquinista.sort(comparator);
       for(Maquinista conta : quadroDeMaquinista ) {
            System.out.println(conta);
        }
    }  
        
}
